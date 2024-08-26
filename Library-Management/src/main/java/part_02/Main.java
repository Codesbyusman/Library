package part_02;
import com.google.gson.Gson;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Library<Media> Library = new Library<>();

        Observer observer1 = new Observer(1);
        Observer observer2 = new Observer(2);
        Observer observer3 = new Observer(3);

        Library.addObserver(observer1);
        Library.addObserver(observer2);

        Gson gson = new Gson();
        BooksMedia[] books = null;

        try
        {
            // getting file
//            File file = new File("src/main/java/part_02/books.json");

            BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/java/part_02/books.json"));

            // getting contents of file
            String line;
            StringBuilder fileContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }

            reader.close();

            // converting json to object using gson
            books = gson.fromJson(fileContent.toString(), BooksMedia[].class);

            System.out.println("\n\nBooks added successfully! from json file\n\n");
//            for (BooksMedia book : books) {
//                book.displayBookInfo();
//                System.out.println(" ");
//            }


        }
        catch (Exception exception) {
            System.out.println("Got exception: " + exception);
        }

//        BooksMedia book = new BooksMedia("book1", "u", 109);
        BooksMedia book = books != null ? books[0] : new BooksMedia("book1", "u", 109);
        book.displayBookInfo();
        Library.addMediaItem(book);
        System.out.println(" ");

        Library.removeObserver(observer1);
        Library.addObserver(observer3);
        System.out.println(" ");

        MovieMedia movie = new MovieMedia("Movie 1", "usman", 1299);
        Library.addMediaItem(movie);

    }
}

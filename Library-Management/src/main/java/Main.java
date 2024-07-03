// to check part 01

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // using Gson  and getting data from json file
        Gson gson = new Gson();
        Books[] books = null;

        try
        {
            // getting file
            File file = new File("src/main/java/books.json");

            BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/java/books.json"));

            // getting contents of file
            String line;
            StringBuilder fileContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }

            reader.close();

            // converting json to object using gson
            books = gson.fromJson(fileContent.toString(), Books[].class);

            System.out.println("\n\nBooks added successfully! from json file\n\n");
            for (Books book : books) {
                book.displayBookInfo();
                System.out.println("");
            }


        }
        catch (Exception exception) {
            System.out.println("Got exception: " + exception);
        }

        // doing processing on books
        BookProcessor bookProcessor = new BookProcessor();

        // display details of all books
        System.out.println("\n\nDisplaying details of all books\n\n");
        bookProcessor.displayDetails(books);

        // finding book on specific author
        System.out.println("\n\nFinding books of author\n\n");
        System.out.println("Enter author name: ");
        Scanner input = new Scanner(System.in);
        String author = input.nextLine();

        ArrayList<Books> foundBooks = bookProcessor.findBook(books, author);
        if(foundBooks != null)
        {
            for (Books book : foundBooks) {
                book.displayBookInfo();
                System.out.println(" ");
            }
        }

        // ---------------------------------------------
        // calculating average price of books
        // --------------------------------------------

        System.out.println("\n\nCalculating average price of books\n\n");
        System.out.println("Average price of books: " + bookProcessor.getAveragePrice(books));

        // ---------------------------------------------
        // finding book with highest price
        // --------------------------------------------

        System.out.println("\n\nFinding book with highest price\n\n");
        System.out.println("Book Title with highest price: " + bookProcessor.getBookTitleWithHighestPrice(books));

        // ---------------------------------------------
        // finding books of specific category
        // --------------------------------------------

        System.out.println("\n\nFinding books of specific category\n\n");
        System.out.println("Enter category: ");
        String category = input.nextLine();
        ArrayList<Books> foundBooksCategory = bookProcessor.findBooksOfCategory(books, category);

        if(foundBooksCategory.isEmpty())
        {
            System.out.println("No books found for category: " + category);
        }
        else
        {
            System.out.println("Books found for category: " + category);
            for (Books book : foundBooksCategory) {
                book.displayBookInfo();
                System.out.println(" ");
            }
        }


    }
}
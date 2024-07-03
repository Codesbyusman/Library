//import java.util.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BookProcessor {
    public void displayDetails(Books[] allBooks) {
        for (Books book : allBooks) {
            book.displayBookInfo();
        }
    }

    public ArrayList<Books> findBook(Books[] allBooks, String Author) {
        ArrayList<Books> foundBooks = new ArrayList<>();
        Arrays.stream(allBooks).filter(book -> book.getAuthor().equals(Author)).forEach(foundBooks::add);

        if (foundBooks.isEmpty()) {
            System.out.println("No books found for author: " + Author);
            return null;
        }

        System.out.println("Books found for author: " + Author);
        return foundBooks;

    }

    public double getAveragePrice(Books[] allBooks) {
        return Arrays.stream(allBooks).mapToDouble(book -> book.getMetadata().getPrice()).average().orElse(0.0);
    }

    public String getBookTitleWithHighestPrice(Books[] allBooks) {
        return Arrays.stream(allBooks).max(Comparator.comparing(books -> books.getMetadata().getPrice())).get().getTitle();
    }

    public ArrayList<Books> findBooksOfCategory(Books[] allBooks, String category) {
        ArrayList<Books> foundBooks = new ArrayList<>();
        Arrays.stream(allBooks).filter(book -> book.getMetadata().getCategories().contains(category.toLowerCase())).forEach(foundBooks::add);

        return foundBooks;
    }

}
package part_02;

public class Main {
    public static void main(String[] args) {
        Library<Media> Library = new Library<>();

        Observer observer1 = new Observer(1);
        Observer observer2 = new Observer(2);
        Observer observer3 = new Observer(3);

        Library.addObserver(observer1);
        Library.addObserver(observer2);


        BooksMedia book = new BooksMedia("book1", "u", 109);
        Library.addMediaItem(book);
        System.out.println(" ");

        Library.removeObserver(observer1);
        Library.addObserver(observer3);
        System.out.println(" ");

        MovieMedia movie = new MovieMedia("Movie 1", "usman", 1299);
        Library.addMediaItem(movie);

    }
}

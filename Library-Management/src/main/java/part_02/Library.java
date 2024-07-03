package part_02;

import java.util.ArrayList;

public class Library<T extends Media> {
    private ArrayList<T> mediaItems;
    private ArrayList<LibraryObserver> observers = new ArrayList<>();

    // constructor
    Library(){
        mediaItems = new ArrayList<>();
        System.out.println("Library created");
    }

    // adding and deleting observers
    // notifying observers

    public void addObserver(LibraryObserver observer){
        observers.add(observer);
        System.out.println(observer.toString() + " added\n");
    }

    public void removeObserver(LibraryObserver observer){
        observers.remove(observer);
        System.out.println(observer.toString() + " removed\n");
    }

    public void notifyObservers(LibraryEvent libraryEvent){
        for(LibraryObserver observer : observers){
            observer.updateEvent(libraryEvent);
        }
    }

    // adding and deleting media items
    public void addMediaItem(T mediaItem){
        mediaItems.add(mediaItem);
        LibraryEvent libraryEvent = new LibraryEvent("Media Item : " + mediaItem.getClass().getName() + " added");
        notifyObservers(libraryEvent);
    }

}

package part_02;

public class Observer implements LibraryObserver{
    private int id ;

    Observer(int id){
        this.id = id;
    }

    @Override
    public void updateEvent(LibraryEvent libraryEvent) {
        System.out.println("BookObserver - " + this.id + " we have event for u ->: " + libraryEvent.getEventName());
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Observer{" +
                "id=" + id +
                '}';
    }
}

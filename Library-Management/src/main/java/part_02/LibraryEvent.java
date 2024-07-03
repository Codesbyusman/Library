package part_02;

public class LibraryEvent {
    private String eventName = "";

    // constructor
    LibraryEvent(String eventName){
        this.eventName = eventName;
    }

    // getter
    public String getEventName(){
        return eventName;
    }
}

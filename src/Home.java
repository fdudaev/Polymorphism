public class Home {

    private String color;
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfRooms;
    private int numberOfRestRooms;
    private  int garages;
    private int stories;

    public Home(String color, int numberOfDoors, int numberOfWindows, int numberOfRooms, int numberOfRestRooms, int garages, int stories) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfRooms = numberOfRooms;
        this.numberOfRestRooms = numberOfRestRooms;
        this.garages = garages;
        this.stories = stories;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfRestRooms() {
        return numberOfRestRooms;
    }

    public int getGarages() {
        return garages;
    }

    public int getStories() {
        return stories;
    }
}

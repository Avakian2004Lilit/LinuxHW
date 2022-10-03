package classwork4;

public class House {
    int numberOfRooms;
    String color;
    int width;
    int length;
    int high;

    public House(int numberOfRooms,int width,int length,int high,String color){

        this.high = high;
        this.length = length;
        this.width = width;
        this.color = color;
        this.numberOfRooms = numberOfRooms;
    }
    public House(){
        System.out.println("Конструктор создался");

    }

    public String toString;

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", high=" + high +
                ", toString='" + toString + '\'' +
                '}';
    }
}



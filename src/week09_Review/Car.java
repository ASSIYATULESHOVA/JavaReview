package week09_Review;

public class Car {


    private String made, model, color;
    private short year;
    private double price;


    public Car(String made, String model, String color, short year, double price) {
        this.made = made;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }



    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package inheritance;

public class Cat extends Animal{
    private String color;

//  Constructor

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "white";
    }

//  Getter

    public String getColor() {
        return color;
    }

//  Setter

    public void setColor(String color) {
        this.color = color;
    }
}

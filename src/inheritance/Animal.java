package inheritance;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

//  Constructor

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public Animal() {
    }

//  Getter

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

//  Setter

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}

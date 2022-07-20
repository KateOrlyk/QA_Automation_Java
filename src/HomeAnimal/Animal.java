package HomeAnimal;

public abstract class Animal {
    private String name;

//Constructor

    public Animal(String name) {
        this.name = name;
    }

//Getter

    public String getName() {
        return name;
    }

    abstract void greets();

}

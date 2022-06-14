package home_work.Dog;

public class Home_Work_Dog {
    private String name;
    private int age;
    private String color;
    private int height;

//  Constructor

    public Home_Work_Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Home_Work_Dog(String color, int height) {
        this.name = "Han Solo";
        this.age = 2;
        this.color = color;
        this.height = height;
    }

    public Home_Work_Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    //  Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

//  Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

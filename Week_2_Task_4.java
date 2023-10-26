package Week_2;

// Applying Abstraction
abstract class Animal {

    public void eat() {
        System.out.println("Animal eat");
    }

    public void move() {
        System.out.println("Animal move");
    }
}

class Dog extends Animal {  // Inheriting the Parent Class
    private String name;   // closing the attributes for modifying
    private int age;       // closing the attributes for modifying
    int legs = 4;


    public Dog (String name){   // Constructor for Dog class
        this.name = name;
    }

    public String getName(){    // Getter for Dog name
        return name;
    }

    public int getAge() {     // setting getter for the age
        return age;
    }

    public void setAge(int veryfied_age) {    // setting setter for the age with condition
        if (veryfied_age > 0 && veryfied_age < 14){
            this.age = veryfied_age;
        }
    }

    @Override   // Overriding the parent class methods
    public void eat() {
        System.out.println("Dog Eat");
    }

    @Override  // Overriding the parent class methods
    public void move() {
        System.out.println("Dog Move");
    }
}

class Cat extends Animal {  // Inheriting the Parent Class
    private String name;
    private int age;

    public Cat(String name) {                   // Constructor
        this.name = name;
    }

    public void setName(String new_name){       // Setter for Cat Name
        if (new_name.length() > 0 && new_name.length() < 10 && new_name != "Bob") {
            this.name = new_name;
        }
    }

    public String getName(){                    // Getter for Cat name
        return name;
    }

    @Override   // Overriding the parent class methods
    public void eat() {
        System.out.println("Cat Eat");
    }

    @Override   // Overriding the parent class methods
    public void move() {
        System.out.println("Cat Move");
    }
}

class Breed extends Dog{  // Multi inheritance from Dog
    String breed_name;
    int age;

    public Breed(String name) {
        super(name);
    }
}



public class Task_4 {
    public static void main(String[] args) {
        /*
        Create an interface called "Animal" with methods "eat" and "move"
        Create two classes called "Dog" and "Cat" that implement the "Animal" interface
        Implement the "eat" and "move" methods for each class
        Create objects of the Dog and Cat classes and call their "eat" and "move" methods
         */

        Dog dog = new Dog("Dog1");
        dog.eat();
        dog.move();


        Cat cat = new Cat("Cat1");
        cat.eat();
        cat.move();

        // Dog
        System.out.println(dog.getAge());
        dog.setAge(15);         // we can't set 15
        dog.setAge(10);         // 10 is successful since fit between 0 and 14
        System.out.println(String.format("Dog with name %s and age %s", dog.getName(), dog.getAge()));

        // Cat
        String cat_name = cat.getName();
        System.out.println(cat_name);
        cat.setName("Bob");         // not successful due to restrictions
        System.out.println(cat.getName());
        cat.setName("Rob");         // successfully
        System.out.println(cat.getName());


        Breed breed = new Breed("Breed1");
        breed.setAge(3);        // setting age trought parent class
        System.out.println(String.format("Name of the breed: %s, age: %s, legs: %s", breed.getName(), breed.getAge(), breed.legs)); // legs apply only for Breed class

    }
}


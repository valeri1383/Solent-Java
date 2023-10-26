package Week_2;

class Person {
    String name;
    int age;
}

public class Task_1 {
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.age = 25;
        person1.name = "ivan";

        System.out.println(person1.name + " " +  person1.age);

    }
}
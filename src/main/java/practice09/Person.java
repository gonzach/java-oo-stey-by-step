package practice09;

public class Person {
    private String name;
    private int age;
    private int id;
    Klass obj;

    public Person(int id, String name, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(int id, String name, int age, Klass klass){
        this.name = name;
        this.age = age;
        this.id = id;
        this.obj = klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Klass getKlass() {
        return obj;
    }

    public String introduce(){
        return ("My name is " + this.name + ". I am " + this.age + " years old.");
    }
}

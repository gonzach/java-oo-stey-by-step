package practice11;

public class Person {
    int id;
    String name;
    int age;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return obj.hashCode() == hashCode();
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String introduce(){
        return ("My name is " + this.name + ". I am " + this.age + " years old.");
    }
}

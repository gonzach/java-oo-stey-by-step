package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private int id;
    private String name;
    private int age;
    Klass obj;
    Student student;
    LinkedList<Klass> KlasslinkedList;

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.KlasslinkedList = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return super.getName();
    }

    public int getAge(){
        return super.getAge();
    }

    public LinkedList<Klass> getClasses() {
        return this.KlasslinkedList;
    }

    public String introduce() {
        if ( this.KlasslinkedList != null ) {
            return (super.introduce() + " I am a Teacher. I teach Class "+ this.KlasslinkedList.getFirst().getNumber()+ ", " + this.KlasslinkedList.getLast().getNumber() + ".");
        } else {
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }
    }

    public boolean isTeaching(Student name) {
        this.student = name;
        if ( this.KlasslinkedList.getFirst().getNumber() == this.student.getKlass().getNumber() ) {
           return true;
        } else {
            return false;
        }
    }

    public String introduceWith(Student name) {
        this.student = name;
        if ( this.KlasslinkedList.getFirst().getNumber() != this.student.getKlass().getNumber() ) {
            return ( super.introduce() + " I am a Teacher. I don't teach " + this.student.getName() + ".");
        } else {
            return ( super.introduce() + " I am a Teacher. I teach " + this.student.getName() + ".");
        }
    }
}

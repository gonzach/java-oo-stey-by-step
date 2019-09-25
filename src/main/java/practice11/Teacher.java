package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    int id;
    int size;
    String name;
    int age;
    Klass klass;
    Student student;

    LinkedList<Klass> KlasslinkedList = new LinkedList<Klass>();

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.KlasslinkedList = linkedList;
        KlasslinkedList.forEach(klass -> {
            klass.addObserver(this);
        });
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
        if ( this.KlasslinkedList.size() == 0){
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        } else {
            return (super.introduce() + " I am a Teacher. I teach Class "+ this.KlasslinkedList.getFirst().getNumber()+ ", " + this.KlasslinkedList.getLast().getNumber() + ".");
        }
    }

    public boolean isTeaching(Student name) {
        this.student = name;
        if ( KlasslinkedList.getFirst().getNumber() == student.getKlass().getNumber() ) {
            return true;
        } else {
            return false;
        }
    }

    public String introduceWith(Student name) {
        this.student = name;
        if ( KlasslinkedList.getFirst().getNumber() != student.getKlass().getNumber() ) {
            return ( super.introduce() + " I am a Teacher. I don't teach " + getName() + ".");
        } else {
            return ( super.introduce() + " I am a Teacher. I teach " + student.getName() + ".");
        }
    }

    public void update(Student student, Klass klass) {
        if ( klass.getLeader() != null ){
            System.out.print("I am " +  this.getName() + ". I know " + student.getName() + " become Leader of Class " + klass.getNumber() + ".\n");
        } else {
            System.out.print("I am " +  this.getName() + ". I know " + student.getName() + " has joined Class " + klass.getNumber() + ".\n");
        }
    }
}

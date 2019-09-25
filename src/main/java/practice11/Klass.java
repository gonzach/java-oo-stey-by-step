package practice11;

import java.util.LinkedList;
import java.util.Observable;

public class Klass extends Observable {
    private int num;
    private String name;
    private String displayName;
    private Student obj;
    LinkedList<Student> list = new LinkedList<Student>();
    LinkedList<Teacher> list_teacher = new LinkedList<Teacher>();

    public Klass(int i) {
        this.num = i;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return ("Class 2");
    }

    public void assignLeader(Student student) {
        boolean ans = this.list.contains(student);
        if ( !ans ) {
            System.out.print("It is not one of us.\n");
        } else {
            this.obj = student;
            notifyObservers(student);
        }
    }

    public Student getLeader() {
        return obj;
    }

    public void appendMember(Student student) {
        list.add(student);
        if ( obj !=null ){
            notifyObservers(this);
        } else {
            notifyObservers(student);
        }
    }

    public synchronized void addObserver(Teacher o) {
        list_teacher.add(o);
    }

    public void notifyObservers(Student student){
        list_teacher.forEach(teacher -> {
            teacher.update(student, this);
        });
    }
}



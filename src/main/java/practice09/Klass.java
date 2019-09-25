package practice09;

import java.util.LinkedList;

public class Klass{
    private int num;
    private String displayName;
    Student obj;
    LinkedList<Student> list = new LinkedList<Student>();

    public Klass(int i) {
        this.num = i;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return ("Class 2");
    }

    public void assignLeader(Student name) {
        boolean ans = this.list.contains(name);
        if ( !ans ) {
            System.out.print("It is not one of us.\n");
        } else {
            this.obj = name;
        }
    }

    public Student getLeader() {
        return obj;
    }

    public void appendMember(Student name) {
        list.add(name);
    }
}

package practice09;

public class Teacher extends Person{
    private int id;
    private String name;
    private int age;
    Klass obj;
    Student student;
    public Teacher (int id, String name, int age, Klass klass){
        super(id,name,age,klass);
        this.id = id;
        this.name = name;
        this.age = age;
        this.obj = klass;
    }

    public Teacher (int id, String name, int age){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.obj = null;
    }

    public String getName(){
        return super.getName();
    }

    public int getAge(){
        return super.getAge();
    }

    public Klass getKlass(){
        return super.getKlass();
    }

    public String introduce() {
        if  ( this.obj == null ) {
            return ("My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach No Class.");
        } else {
            return ("My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach Class "+ this.getKlass().getNumber() + ".");
        }
    }

    public String introduceWith(Student name) {
        this.student = name;
        if ( this.obj.getNumber() != this.student.getKlass().getNumber() ) {
            return ( super.introduce() + " I am a Teacher. I don't teach " + this.student.getName() + ".");
        } else {
            return ( super.introduce() + " I am a Teacher. I teach " + this.student.getName() + ".");
        }
    }
}

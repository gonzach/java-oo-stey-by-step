package practice10;

public class Student extends Person{
    Klass obj;
    Student student;
    private String name;
    private int age;

    public Student(int id, String name, int age, Klass klass){
        super(id, name, age, klass);
        this.name = name;
        this.age = age;
        this.obj = klass;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Klass getKlass(){
        return obj;
    }

    public String introduce() {
        if ( this.getKlass().getLeader() != null ) {
            return ("My name is " + this.name + ". I am " + this.age + " years old. I am a Student. I am Leader of Class " + this.getKlass().getNumber() + ".");
        } else {
            return ("My name is " + this.name + ". I am " + this.age + " years old. I am a Student. I am at Class " + this.getKlass().getNumber() + ".");
        }
    }
}

package practice03;

public class Student extends Person {
    private int Klass;

    public Student(String name, int age, int i){
        super(name, age);
        this.Klass = i;
    }

    public int getKlass(){
        return Klass;
    }

    @Override
    public String introduce() {
        return ("I am a Student. I am at Class " + this.Klass + ".");
    }
}

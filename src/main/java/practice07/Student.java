package practice07;

public class Student extends Person{
    int klassInt;
    Klass klass;
    public Student(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }

    public Student(String name, int age, int i){
        super(name,age);
        this.klassInt = i;
    }

    public int getKlassInt(){
        return klassInt;
    }
    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return (super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".");
    }
}

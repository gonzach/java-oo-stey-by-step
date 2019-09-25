package practice04;

public class Student extends  Person{
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
       return (super.introduce() + " I am a Student. I am at Class " + this.Klass + ".");
    }
}

package practice07;

public class Teacher extends Person {
    Student student;
    Klass klass;
    int klassInt;

    public Teacher(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }

    public Teacher(String name, int age, int i){
        super(name,age);
        this.klassInt = i;
    }

    public Teacher(String name, int age){
        super(name,age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return ( super.introduce() + " I am a Teacher. I teach No Class.");
        } else {
            return ( super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".");
        }
    }

    public String introduceWith(Student name){
        this.student = name;
        if ( this.klass == this.student.getKlass() ) {
            return ( super.introduce() + " I am a Teacher. I teach " + this.student.getName() + ".");
        } else if ( this.klassInt == this.student.getKlassInt() ){
            return ( super.introduce() + " I am a Teacher. I don't teach " + this.student.getName() + ".");
        } else {
            return null;
        }
    }

}

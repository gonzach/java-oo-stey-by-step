package practice06;

public class Teacher extends Person{
    private int Klass;

    public Teacher(String name, int age, int i){
        super(name, age);
        this.Klass = i;
    }

    public int getKlass() {
        return this.Klass;
    }

    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public String introduce() {
        if ( this.Klass == 0 ) {
            return ( super.introduce() + " I am a Teacher. I teach No Class.");
        } else {
            return ( super.introduce() + " I am a Teacher. I teach Class " + this.Klass + ".");
        }
    }
}


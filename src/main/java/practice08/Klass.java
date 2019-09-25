package practice08;

public class Klass {
    private  int number;
    private String DisplayName;
    Student obj;


    public Klass(int i) {
        this.number = i;
    }

    public int getNumber(){

        return this.number;
    }

    public String getDisplayName()
    {
        return ("Class 2");
    }

    public void assignLeader(Student obj) {
        this.obj = obj;
    }

    public Student getLeader() {
        return obj;
    }
}

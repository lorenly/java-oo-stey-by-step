package practice08;

public class Klass {
    private int c;
    private Student leader;

    Klass(int c){
        this.c = c;
    }

    public int getNumber(){
        return c;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }

    public void assignLeader(Student leader){
        this.leader = leader;
    }

    public Student getLeader(){
        return this.leader;
    }
}

package practice09;

public class Klass {
    private int c;
    private Student leader;
    private StringBuilder std = new StringBuilder();

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
        if(std.length() == 0)
            System.out.print("It is not one of us.\n");
        else
            this.leader = leader;
    }

    public void appendMember(Student student){
        std.append(student);
    }

    public Student getLeader(){
        return this.leader;
    }

    public boolean equals(Object obj){
        return ((Klass) obj).leader == leader;
    }
}

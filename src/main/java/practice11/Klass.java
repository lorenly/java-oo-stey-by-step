package practice11;

import java.util.LinkedList;

public class Klass {
    private int c;
    private Student leader;
    LinkedList<Student> linkedList;

    Klass(int c){
        this.c = c;
        linkedList = new LinkedList<Student>();
    }

    public int getNumber(){
        return c;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }

    public void assignLeader(Student leader){
        if(this.linkedList.size() == 0)
            System.out.print("It is not one of us.\n");
        else {
            System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
            this.leader = leader;
        }
    }

    public void appendMember(Student student){
        System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
        linkedList.add(student);
    }

    public LinkedList<Student> studentList(){
        return linkedList;
    }



    public Student getLeader(){
        if(this.leader != null)
            return this.leader;
        return new Student(0,null,0,null);
    }

    public boolean equals(Object obj){
        return ((Klass) obj).leader == leader;
    }
}

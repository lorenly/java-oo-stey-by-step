package practice02;

public class Student extends Person{
    private int c;

    Student(String name, int age, int c) {
        super(name,age);
        this.c = c;

    }

    public int getKlass(){
        return this.c;
    }

    public String introduce(){
        return "I am a Student. I am at Class " + getKlass() + ".";
    }

}

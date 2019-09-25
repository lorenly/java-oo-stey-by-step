package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> linkedList;

    Teacher(int id, String name, int age){
        super(id, name, age);
        linkedList = new LinkedList<Klass>();
    }
    Teacher(int id, String name, int age, LinkedList<Klass> linkedList){
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce() {
        if (this.getClasses().size() > 0){
            String cls = "";
            for (int i = 0; i < getClasses().size(); i++) {
                cls += getClasses().get(i).getNumber();
                if (getClasses().size() - 1 > i) {
                    cls += ", ";
                }
            }
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + cls + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(this.getClasses().getFirst().getNumber() == student.getKlass().getNumber())
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";

    }

    public LinkedList<Klass> getClasses(){
        return linkedList;
    }

    public boolean isTeaching(Student student){
        return this.getClasses().getFirst().getNumber() == student.getKlass().getNumber();
    }
}

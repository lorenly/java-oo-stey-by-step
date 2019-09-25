package practice11;

public class Student extends Person{
    private Klass klass;
    Student(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }


    public String introduce(){
        if(klass.getLeader() != klass.getLeader())
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of Class " + klass.getNumber() + ".";
    }

    public boolean isIn(Klass klass){
        return klass.studentList().contains(this.getKlass());
    }
}

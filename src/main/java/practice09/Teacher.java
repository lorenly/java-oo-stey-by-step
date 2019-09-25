package practice09;

public class Teacher extends Person{
    private Klass klass;

    Teacher(int id, String name, int age){
        super(id, name, age);
    }
    Teacher(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }

    public String introduce(){
        if(klass != null)
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(klass.getNumber() == student.getKlass().getNumber())
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }
}

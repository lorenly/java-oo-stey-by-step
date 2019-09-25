package practice07;

public class Teacher extends Person{
    Klass klass;

    Teacher(String name, int age){
        super(name, age);
    }

    Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }

    public String introduce(){

        if(klass == null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";

    }
    public String introduceWith(Student student){
        if(klass.getNumber() != student.klass.getNumber()){
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
    }
}

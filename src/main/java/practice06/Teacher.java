package practice06;

public class Teacher extends Person{
    int c;

    Teacher(String name, int age){
        super(name, age);
    }
    Teacher(String name, int age, int c){
        super(name, age);
        this.c = c;
    }

    public int getKlass(){
        return c;
    }

    public String introduce(){
        if(c != 0) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + getKlass() + ".";
        }else{
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }
}

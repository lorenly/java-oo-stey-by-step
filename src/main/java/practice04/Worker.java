package practice04;

public class Worker extends Person{
    Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Worker. I have a job.";
    }
}

package practice10;

public class Person {
    private String name;
    private int age;
    private int id;

    Person(){}
    Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return this.id;
    }

    public String introduce(){
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }


    public boolean equals(Object obj){
        return ((Person) obj).getId() == getId();
    }
}

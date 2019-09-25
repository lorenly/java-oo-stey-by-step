package practice07;

public class Klass {
    private int c;

    Klass(int c){
       this.c = c;
    }

    public int getNumber(){
        return c;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }
}

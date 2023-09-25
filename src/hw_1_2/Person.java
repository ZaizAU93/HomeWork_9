package hw_1_2;

public class Person {
    final static String name = "Boris";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;

    public static void getString(){
        System.out.println(name);
    }
}

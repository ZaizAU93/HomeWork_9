package hw_1_1;

public class Circle extends Shape{

    public String circle = "circle";
    @Override
    public void drow() {
        System.out.println("I draw "+circle);
    }

    @Override
    public void erase() {
        System.out.println("I erase "+circle);
    }
}

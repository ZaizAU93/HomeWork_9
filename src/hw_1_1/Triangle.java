package hw_1_1;

public class Triangle extends Shape{
    public String triangle = "Triangle";
    @Override
    public void drow() {
        System.out.println("I draw "+triangle);
    }

    @Override
    public void erase() {
        System.out.println("I erase"+triangle);
    }
}

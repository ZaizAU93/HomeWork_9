package hw_1_1;

public class Square extends Shape{
    public String square = "Square";
    @Override
    public void drow() {
        System.out.println("I draw "+square);
    }

    @Override
    public void erase() {
        System.out.println("I erase "+square);
    }
}

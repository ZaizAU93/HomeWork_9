package hw_2_1;

public class Dog extends Animal{


    @Override
    public void voice() {
        System.out.println("Dog");
    }



    @Override
    public void eat(String food) {
     if (food.equals("meat"))
      System.out.println(" Dog eats "+ food);
     else
      System.out.println("Dog does not eat" + food);
    }
}

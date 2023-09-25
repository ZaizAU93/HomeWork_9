package hw_2_1;

public class Rabbit extends Animal{


    @Override
    public void voice() {
        System.out.println("Rabbit");
    }

    @Override
    public void eat(String food) {
        if (food.equals("grass"))
            System.out.println("Rabbit eats " + food);
        else
            System.out.println("Rabbit does not eat" + food);
    }

}

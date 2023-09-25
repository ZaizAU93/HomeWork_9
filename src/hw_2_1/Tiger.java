package hw_2_1;

public class Tiger extends Animal{


    @Override
    public void voice() {
        System.out.println("Tiger");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat"))
            System.out.println("Tiger eats "+ food);
        else
            System.out.println("Tiger does not eat " + food);
    }

}

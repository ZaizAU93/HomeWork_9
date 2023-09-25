package hw_2_1;

public class Dog_limited {
    private Dog_limited() {
        System.out.println("Обьект создан");
    }

    public void voice() {
        System.out.println("Гав!");
    }

    public void eat() {
        System.out.println("Собака люит кость.");
    }

    public static Dog_limited  createDog() {
        return new Dog_limited();
    }
}

import hw_1_1.Circle;
import hw_1_1.Shape;
import hw_1_1.Square;
import hw_1_1.Triangle;
import hw_1_2.Person;
import hw_2_1.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Задача 1:
        //Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
        //из классов так, чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса. Показать
        //работу каждого из методов в main другого класса.

        Shape[] mas = {new Circle(),new Square(), new Triangle()};
        for (int i = 0; i < mas.length; i++){
            mas[i].drow();
            mas[i].erase();
        }

        //Создать класс Person. Написать статическое финальное поле name и статический метод,
        //который выводит его имя в консоль. Реализовать в методе main другого класса вызов
        //поля и метода не создавая объекта класса Person.

        System.out.println("zadanie 2");
        Person.getString();

        //Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        //Переопределить методы voice(), eat(String food) чтобы они выводили верную
        //информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        //Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        //туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
        //или другую строку то он будет недоволен.
        Scanner line = new Scanner(System.in);

        Animal[] animals = {new Dog(),new Tiger(), new Rabbit()};
        for (int i = 0; i < mas.length; i++){
            animals[i].voice();
            System.out.println("Введеите что будет кушать животное. grass или meat");
            animals[i].eat(line.nextLine());

        }


        //Задача *:
        //Написать такой конструктор, который запретит создание объекта класса Dog в других
        //классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
        //обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
        //способа

        Dog_limited Dog_2 = Dog_limited.createDog();
        Dog_2.voice();
        Dog_2.eat();


    }
}
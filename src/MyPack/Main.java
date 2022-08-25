package MyPack;

import java.util.Scanner;
import MyPack.Task1.Worker;
import MyPack.Task2.a.SameName;
import MyPack.Task3.Car;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------TASK1--------------------------------------------");
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input surname");
        String surname = scanner.nextLine();
        System.out.println("Input father's name");
        String fatherName = scanner.nextLine();
        System.out.println("Input post");
        String post = scanner.nextLine();
        System.out.println("Input email");
        String email = scanner.nextLine();
        System.out.println("Input phone number");
        String phonenum = scanner.nextLine();
        System.out.println("Input age");
        int age = scanner.nextInt();

        Worker worker = new Worker(name, surname, fatherName, post, email, phonenum, age);

        System.out.println("New worker registrated!");
        worker.info();

        System.out.println("-------------------------------------TASK2--------------------------------------------");
        MyPack.Task2.a.SameName samenameA = new MyPack.Task2.a.SameName();
        samenameA.info();
        MyPack.Task2.b.SameName samenameB = new MyPack.Task2.b.SameName();
        samenameB.info();

        System.out.println("-------------------------------------TASK3--------------------------------------------");
        Car car = new Car();
        car.start();
    }
}

package OOP.DynamicPolymorphism;

import OOP.AccessModifiers.package1.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal ;


        System.out.println("What animal do you want?");
        System.out.println("(1 = Dog) or (2 = cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();

        }else{
            animal = new Animal();
            System.out.println("Thaw choice was invalid");
            animal.speak();
        }
    }
}

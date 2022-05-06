package omer.bitikcioglu.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialize coffee machine and show coffees
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.showCoffees();

        // Take the coffee order from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        int order;
        try {
            order = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Sadece sayı girebilirsiniz!");
            return;
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}

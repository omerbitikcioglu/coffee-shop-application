package omer.bitikcioglu.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialize coffee machine and show coffees
        CoffeeMachine cm = new CoffeeMachine();
        cm.showCoffees();

        // Take the coffee order from the user
        int order = getCoffeeOrder(cm.getNumOfCoffees());
        if (order == -1) return; // Error
        System.out.println("Teşekkürler kahveniz hazırlanıyor.");

        // Prepare the order and give information
        Coffee orderedCoffee = cm.getCoffee(order-1);
        System.out.println(orderedCoffee.getCoffeeName() + " seçtiniz. " +
                "Bu içeceğimiz " + orderedCoffee.getRecipe() + " içermektedir." +
                " Afiyet olsun.");
    }

    /**
     * Takes a coffee order from user and returns it.
     *
     * @param numOfCoffees The count of coffee types in the system.
     * @return The coffee order from the user.
     */
    private static int getCoffeeOrder(int numOfCoffees) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        int order;
        try {
            order = sc.nextInt();
            sc.close();
            if (order < 1 || order > numOfCoffees) {
                throw new IndexOutOfBoundsException();
            }
        } catch (InputMismatchException e) {
            System.err.println("Sadece sayı girebilirsiniz!");
            return -1;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Belirtilen aralıkta sayı giriniz!");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
        return order;
    }
}

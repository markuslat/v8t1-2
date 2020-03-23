package com.example.v8t2;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class BottleDispenser {

    private String name;
    private int bottles;
    private double money;

    String [] names = {"Pepsi Max", "Pepsi Max", "Coca-Cola Zero",
            "Coca-Cola Zero", "Fanta Zero"};
    double [] prices = {1.8, 2.2, 2.0, 2.5, 1.95};
    double [] sizes = {0.5, 1.5, 0.5, 1.5, 0.5};

    ArrayList<Bottle> bottles_array = new ArrayList<>();

    private static BottleDispenser bd = new BottleDispenser();

    private BottleDispenser() {
        bottles = 5;
        money = 0.0;

        for(int i = 0;i<bottles;i++) {
            Bottle bottle = new Bottle(names[i], sizes[i], prices[i]);
            bottles_array.add(i, bottle);
        }
    }

    public static BottleDispenser getInstance() {
        return bd;
    }

    public void addMoney(TextView text) {

        money += 1;
        System.out.println("Klink! Added more money!");
    }

    public void buyBottle(TextView text) {
        int choice;
        System.out.print("Your choice: ");
        Scanner scanner2 = new Scanner(System.in);
        choice = scanner2.nextInt()-1;

        if (bottles_array.get(choice).getPrice()<money) {

            System.out.println("KACHUNK! " +
                    bottles_array.get(choice).getName() + " came out of the dispenser!");
            money -= bottles_array.get(choice).getPrice();
            bottles_array.remove(choice);
            bottles -= 1;
        }
        else {
            System.out.println("Add money first!");
        }
    }


    public void returnMoney(TextView text) {

        System.out.printf("Klink klink. Money came out! "
                + "You got %.2f€ back\n", money);
        money = 0;
    }

    public void list() {
        for (int s = 0;s < bottles_array.size(); s++) {
            System.out.print(s+1 + ". Name: " + bottles_array.get(s).getName()
                    + "\n\tSize: " + bottles_array.get(s).getSize() +
                    "\tPrice: " + bottles_array.get(s).getPrice() + "\n");
        }
    }
}

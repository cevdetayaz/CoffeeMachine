package machine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int disposableCups = 9;
        int money = 550;
        String komut = "";


        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            komut = scanner.next();

            switch (komut){
                case "fill":
                    System.out.println("\nWrite how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    disposableCups += scanner.nextInt();
                    break;
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String secenek = scanner.next();

                    switch (secenek) {
                        case "1":
                            if(water >= 250 && coffee >= 16 && disposableCups >= 1){
                                water -= 250;
                                coffee -= 16;
                                money += 4;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!\n");

                            }
                            else if (water < 250) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (coffee < 16) {
                                System.out.println("Sorry, not enough coffee!\n");
                            }
                            break;
                        case "2":
                            if(water >= 350 && coffee >= 20 && disposableCups >= 1 && milk >= 75) {
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                money += 7;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            else if (water < 350) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (coffee < 20) {
                                System.out.println("Sorry, not enough coffee!\n");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!\n");
                            }
                            break;
                        case "3":
                            if(water >= 200 && coffee >= 12 && disposableCups >= 1 && milk >= 100) {
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                money += 6;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            else if (water < 200) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (coffee < 12) {
                                System.out.println("Sorry, not enough coffee!\n");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!\n");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "take":
                    System.out.println("I gave you $" + money +"\n");
                    money -= money;

                    break;
                case "remaining":
                    System.out.println("\nThe coffee machine has:\n" + water + " ml of water\n" + milk + " ml of milk\n" + coffee + " g of coffee beans\n" + disposableCups + " disposable cups\n" + "$" + money + " of money\n");

                    break;

            }

        } while (!komut.equals("exit"));




    }

}

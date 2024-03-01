package org.example.View;

import org.example.Controller.Controller;
import java.util.Scanner;

public class View {

    private final Scanner scanner = new Scanner(System.in);
    private final Controller controller = new Controller();

    //Constructor
    public View() {
    }

    //Requests
    private String inputName() {
        System.out.println("Enter the name of animal");
        return scanner.nextLine();
    }

    private String inputDateOfBirth() {
        System.out.println("Enter birthday of the animal");
        return scanner.nextLine();
    }


    private String inputNewCommands() {
        System.out.println("Enter a new command for the animal");
        return scanner.nextLine();
    }

    private String chooseType() {
        System.out.println("Choose the type of animal:\n");
        System.out.print("Your choice -> ");
        return scanner.nextLine();
    }

    //Menu
    public void start() {
        boolean flag = true;
        String menu = "\n       ---Menu---\n\n" +
                "1 -> Add animal\n" +
                "2 -> Show all animals\n" +
                "3 -> Show commands of animals\n" +
                "4 -> Teach new command\n" +
                "5 -> Exit\n\n" +
                "Your choice -> ";

        String listAnimals = "\n---Types of the animals---\n\n" +
                "1 -> Dog\n" +
                "2 -> Cat\n" +
                "3 -> Hamster\n" +
                "4 -> Horse\n" +
                "5 -> Camel\n" +
                "6 -> Donkey\n" +
                "7 -> Exit\n\n";

        while (flag) {
            System.out.print(menu);
            String input = scanner.nextLine();
            switch (input) {
                case "1": {
                    System.out.println(listAnimals);
                    String result = chooseType();
                    boolean flagIn = result.equals("7");
                    if (flagIn) break;
                    else {
                        try {
                            controller.addAnimals(result, inputName(), inputDateOfBirth(), inputNewCommands());
                        } catch (Exception e) {
                            System.out.println("\nFields can't be empty!\n");
                        }
                    }
                    break;
                }
                case "2": {
                    controller.printAll();
                    break;
                }

                case "3": {
                    System.out.println(listAnimals);
                    String result = chooseType();
                    boolean flagIn = result.equals("7");
                    if (flagIn) break;
                    else {
                        controller.printCommands(result, inputName());
                    }
                    break;
                }
                case "4": {
                    System.out.println(listAnimals);
                    String result = chooseType();
                    boolean flagIn = result.equals("7");
                    if (flagIn) break;
                    else {
                        controller.addNewCommand(result, inputName(), inputNewCommands());
                    }
                    break;
                }

                case "5": {
                    flag = false;
                    break;
                }
            }
        }
    }
}

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )

    {
        Scanner userScanner = new Scanner(System.in);

        System.out.println( "You find yourself suddenly in world full of dragons" );
        System.out.println("You see two caves. In one cave, the dragon is friendly");
        System.out.println("he will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you choose? (1 or 2)");

        String userInput = userScanner.nextLine();
        System.out.println(userInput + " huh?");

        if (userInput.equals("1"))
        {
            System.out.println("You approach the cave slowly...");
            System.out.println("It's dark and spooky...");
            System.out.println("A large dragon  jumps out in front of you! His jaws open and...");
            System.out.println("Gobbles you down in one bite!");
        }
        if (userInput.equals("2")) {
            System.out.println("The dragon looks to you and says...");
            System.out.println("oh yea, that other dragons lies to get people into his cave to eat them");
        }
        else
        {
            System.out.println("Please choose a valid option");
        }
    }
}

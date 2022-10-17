import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Random rand = new Random();
                Scanner in = new Scanner(System.in);

                boolean stillPlaying = true;
                String continuePlaying;

                System.out.println("Welcome to Craps!\nRules:\n[1] 2 six-sided dice are 'rolled'\n[2] On the initial roll, if the sum adds to 7 or 11, you win (Natural)\n[3] If on the initial roll you get a 2, 3 or 12, you lose (Crapping out)\n[4] If on the initial roll, it's none of those numbers, whatever the sum\n    is will now be your goal to roll it again to win (That number is the Point)\n[5] You will continue 'rolling dice' until the sum is equal to the Point (Win)\n    or the sum equals 7 (Lose) \n    LETS BEGIN\n");

                do {
                    int die1 = rand.nextInt(6) + 1;
                    int die2 = rand.nextInt(6) + 1;
                    int firstSum = die1 + die2;
                    System.out.println("The initial Roll: " + die1 + " + " + die2 + " = " + firstSum);

                    if (firstSum == 7 || firstSum == 11) {
                        System.out.println("Natural. You win.");
                        System.out.println("Do you want to play again? [Y/N]");
                        continuePlaying = in.nextLine();
                        if (continuePlaying.equalsIgnoreCase("Y"))
                        {
                            continue;
                        }
                        else if (continuePlaying.equalsIgnoreCase("N"))
                        {
                            System.out.println("Thanks for playing.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Invalid Input. Exiting Game");
                            System.exit(0);
                        }
                        return;
                    }
                    if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
                        System.out.println("You're crapping out. You lose.");
                        System.out.println("Do you want to play again? [Y/N]");
                        continuePlaying = in.nextLine();
                        if (continuePlaying.equalsIgnoreCase("Y"))
                        {
                            continue;
                        }
                        else if (continuePlaying.equalsIgnoreCase("N"))
                        {
                            System.out.println("Thanks for playing.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Invalid Input. Exiting Game");
                            System.exit(0);
                        }
                        return;
                    }

                    System.out.println("The pointer goal is: " + firstSum + "\n");

                    int secondSum = 0;
                    while (secondSum != firstSum && secondSum != 7) {
                        die1 = rand.nextInt(6) + 1;
                        die2 = rand.nextInt(6) + 1;
                        secondSum = die1 + die2;
                        System.out.println(die1 + " + " + die2 + " = " + secondSum);
                    }

                    if (secondSum == firstSum) {
                        System.out.println("You win.");
                    } else {
                        System.out.println("You lose.");
                    }
                    System.out.println("Do you want to play again? [Y/N]");
                    continuePlaying = in.nextLine();
                    System.out.println("\n");
                    if (continuePlaying.equalsIgnoreCase("Y"))
                    {
                        continue;
                    }
                    else if (continuePlaying.equalsIgnoreCase("N"))
                    {
                        System.out.println("Thanks for playing.");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Invalid Input. Exiting Game");
                        System.exit(0);
                    }
                }

                while (stillPlaying == true);
    }
}
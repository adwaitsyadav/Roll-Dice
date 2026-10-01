import java.util.Random;
import java.util.Scanner;
public class dice {
         public static void main(String[] args) {
                
                Random random = new Random();
                Scanner scanner = new Scanner(System.in);
                int noOfDice ;
                int total = 0;

                System.out.println("Enter the no. of dice to Roll : ");
                noOfDice = scanner.nextInt();

                if(noOfDice>0){

                        for (int i =0 ; i < noOfDice ; i++){
                                int roll = random.nextInt(1,7);
                                printDie(roll);
                                System.out.println("You rolled :  " + roll);
                                total += roll;
                        }
                        System.out.println("Total : "+ total);
                        
                }
                else{
                        System.out.println("No. of dice must be greater than zero ");
                }
                scanner.close();
         }        
         static void printDie(int roll ){
                String dice1 = """
                                 -------
                                |       |
                                |   O   |
                                |       |
                                 -------
                                """;
                 String dice2 = """
                                 -------
                                | O     |
                                |       |
                                |     O |
                                 -------
                                """;
                 String dice3 = """
                                 -------
                                | O     |
                                |   O   |
                                |     O |
                                 -------
                                """;
                 String dice4 = """
                                 -------
                                | O   O |
                                |       |
                                | O   O |
                                 -------
                                """;
                 String dice5 = """
                                 -------
                                | O   O |
                                |   O   |
                                | O   O |
                                 -------
                                """;
                 String dice6 = """
                                 -------
                                | O   O |
                                | O   O |
                                | O   O |
                                 -------
                                """;   
                                
                switch (roll) {

                        case 1 -> System.out.println(dice1);
                        case 2 -> System.out.println(dice2);
                        case 3 -> System.out.println(dice3);
                        case 4 -> System.out.println(dice4);
                        case 5 -> System.out.println(dice5);
                        case 6 -> System.out.println(dice6);
                        default -> System.out.println("Invalid Roll");
                }                
         }
}

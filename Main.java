import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double USD=3.5260;
        double EUR=3.6850;

        PrintMenu();
        double input = scanner.nextInt();

        while (input != 0){
            if (input == 1){
                System.out.println("please enter a sum to change");
                System.out.println("sum after change in dollars is: " +scanner.nextInt()/USD);
                PrintMenu();

            } else if (input==2) {
                System.out.println("please enter a sum to change");
                System.out.println("sum after change in shekels is: " +scanner.nextInt()*USD);
                PrintMenu();


            } else if (input==3) {
                System.out.println("please enter a sum to change");
                System.out.println("sum after change in shekels is: " +scanner.nextInt()*EUR);
                PrintMenu();


            } else if (input==4) {
                System.out.println("please enter a sum to change");
                System.out.println("sum after change in euros is: " +scanner.nextInt()/EUR);
                PrintMenu();


            }else{
                System.out.println("inserted wrong number!!!");
                PrintMenu();


            }
            input = scanner.nextInt();
        }

        System.out.println("Thank you for using my program :) \n Good bay!");
    }

    public static void PrintMenu() {
        System.out.println("Press 1 to convert a shekels to dollars");
        System.out.println("Press 2 to convert a dollars to shekels");
        System.out.println("Press 3 to convert a euro to shekels ");
        System.out.println("Press 4 to convert a shekels to euros");
        System.out.println("Press 0 to exit");
    }
}

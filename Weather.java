import java.util.Scanner;

public class Weather{
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter The Temperature : ");

        heat = input.nextInt();


        if(heat < 5){

            System.out.println("You can Ski.");

        } else if (heat > 5 && heat < 15){

            System.out.println("You can go to The Cinema.");

        } else if (heat == 15){

            System.out.println("You can go to The Cinema.");
            System.out.println("You can go on a Picnic.");

        } else if (heat > 15 && heat < 25){

            System.out.println("You can go on a Picnic.");

        } else {

            System.out.println("You can go Swimming.");

        }

    }
}

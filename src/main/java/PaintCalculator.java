import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("what is the length of the room?");
        double roomLength = sc.nextInt();
        System.out.println("what is the width of the roam?");
        double roomWidth = sc.nextInt();

        double roomArea = roomLength*roomWidth;

        int gallonsNeeded = (int)Math.ceil(roomArea/350);
        System.out.println("you will need " + gallonsNeeded + " gallons of paint");

    }

}

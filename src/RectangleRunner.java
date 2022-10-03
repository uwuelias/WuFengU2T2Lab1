import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();
        System.out.println("Rectangle 1's Area: "+rect1Length*rect1Width+", Box Volume: "+rect1Height*rect1Length*rect1Width);
        System.out.println("Rectangle 2's Area: "+rect2Length*rect2Width+", Box Volume: "+rect2Length*rect2Width*rect2Height);

        // write the rest of your program below
    }
}


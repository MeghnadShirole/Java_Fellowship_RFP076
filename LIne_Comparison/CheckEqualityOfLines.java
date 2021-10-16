
import java.util.Scanner;

public class CheckEqualityOfLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of starting point of first line at X axis: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter the value of starting point of first line at Y axis: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter the value of end point of first line at X axis: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter the value of end point of first line at Y axis: ");
        double y2 = sc.nextDouble();

        double length_of_line = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
//		System.out.println(length_of_line);


        System.out.print("Enter the value of starting point of second line at X axis: ");
        double xx1 = sc.nextDouble();

        System.out.print("Enter the value of starting point of second line at Y axis: ");
        double yy1 = sc.nextDouble();

        System.out.print("Enter the value of end point of second line at X axis: ");
        double xx2 = sc.nextDouble();

        System.out.print("Enter the value of end point of second line at Y axis: ");
        double yy2 = sc.nextDouble();

        double Sec_length_of_line = Math.sqrt(Math.pow((xx2 - xx1),2) + Math.pow((yy2 - yy1 ),2));
//		System.out.println(Sec_length_of_line);

        Double lineOne = length_of_line;
        Double lineTwo = Sec_length_of_line;

        System.out.println("Equality of two line: " + lineOne.equals(lineTwo));


    }
}


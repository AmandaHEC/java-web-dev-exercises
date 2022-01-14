package exercises.Lecture1;
import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        //int length;
        //int width;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle.");
        Double length = input.nextDouble();

        System.out.println("Enter the width of the rectangle.");
        Double width = input.nextDouble();

        Double area = length * width;

        System.out.println("The area of the rectangle is : "+ area +"units squared. ");







    }
}
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            double Area =  CalculateARea();


        }
        //Method to calculate the area of the three shapes
        public static double CalculateARea(){
            AreaCalculation rectangle = new AreaCalculation();

            System.out.println("Please enter the length of the rectangle");
            Scanner scanner = new Scanner(System.in);
            rectangle.setLenth(scanner.nextInt());

            System.out.println("Please enter the width of the rectangle");

            Scanner scanner1 = new Scanner(System.in);
            rectangle.setWindthR(scanner1.nextInt());

               rectangle.setAreaVal(rectangle.getLenth()* rectangle.getWindthR());
            System.out.println("The area of the rectangle is  "+ rectangle.getAreaVal());

            AreaCalculation square= new AreaCalculation();

            System.out.println("Please enter the width of the square");
            Scanner scanner2 = new Scanner(System.in);
            square.setWidthQ(scanner2.nextInt());
            square.setAreaSquare(square.getWidthQ()*square.getWidthQ());

            System.out.println("The area of the square is " + square.getAreaSquare());


            AreaCalculation circle= new AreaCalculation();

            System.out.println("Please enter the radius of the circle ");
            Scanner scanner3 = new Scanner(System.in);
            circle.setRadius(scanner3.nextInt());

            circle.setAreaSquare(Math.PI*Math.pow(circle.getRadius(),2));

            System.out.println("The area of the circle  is  "+ circle.getAreaSquare());


            return 0;
        }
    }
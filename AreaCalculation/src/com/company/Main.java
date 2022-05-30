package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The are of the three shapes are as shown below");


        System.out.println(CalculateARea());



    }
    //Method to calculate the area of the three shaped
    public static boolean CalculateARea(){

        //square properties
        Area square = new Area();
        square. setWidthQ(10);
         double AreaofSquare =square.getWidthQ()*square.getWidthQ();
        System.out.println("Area of the square is " + AreaofSquare);
//rectangle properties
        Area rectangle = new Area();
        rectangle.setWindthR(5);
        rectangle.setLenth(12);
        double AreaofRECTANGLE =rectangle.getWindthR()*rectangle.getLenth();


        System.out.println("The area of the rectangle is " + AreaofRECTANGLE);
//Circle properties
        Area circle = new Area();
        circle.setRadius(7);
        double AreaofcIRCLE =Math.PI*circle.getRadius()*circle.getRadius();

        System.out.println("The area of the circle "+ AreaofcIRCLE);


        return false;
    }


}

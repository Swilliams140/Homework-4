import java.util.Scanner;
import java.util.InputMismatchException;

/*
Class: Triangle
@Stanley Williams
@ version 1.0
Course ITEC 2150
Witten October 19, 2024
This class creates a triangle
 */
public class Triangle {
    // Create the Sides of the triangle
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriagleSideException {
        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
            return true;
        }else {
            throw new IllegalTriagleSideException("Is not a valid triangle");
        }
    }
    public static void main(String[] args){

        //Create 3 triangles
        Triangle triangle1 = new Triangle(1,2,3);
        Triangle triangle2 = new Triangle(4,5,6);
        Triangle triangle3 = new Triangle(7,8,9);


        //Try all of the triangles
        try{
            System.out.println("Triangle 1: "+triangle1.checkSides());
        }catch (IllegalTriagleSideException e){
            System.out.println("Triangle1 "+e.getMessage());
        }
        try{
            System.out.println("Triangle 2: "+triangle2.checkSides());
        }catch (IllegalTriagleSideException e){
            System.out.println("Triangle 2 "+e.getMessage());
        }
        try{
            System.out.println("Triangle 3: "+triangle3.checkSides());
        }catch (IllegalTriagleSideException e){
            System.out.println("Triangle 3 "+e.getMessage());
        }
    }
}

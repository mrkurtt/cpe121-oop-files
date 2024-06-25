package AreaPerimeter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args){
        DecimalFormat d = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        int ch, task;
        do{
            double radius;
            
            System.out.println("PROGRAM TO COMPUTE AREA AND PERIMETER OF 4 SHAPES");
            System.out.println("\n\tSELECT SHAPE: \n\t(1) Circle\n\t(2) Rectangle\n\t(3) Square\n\t(4) Right Triangle\n\t(0) EXIT\n\t>>");
            task = input.nextInt();
            
            if(task == 1){
                System.out.println("CIRCLE");
                System.out.print("Please input the radius: ");
                radius = input.nextDouble();
                Circle c = new Circle(radius);
                
                System.out.println("\n\tCircle with radius = " + c.radius);
                System.out.println("\tArea = " + d.format(c.computeArea())+"\n\tCircumference = " + d.format(c.computeCircumference()));
            } else if(task == 2){
                System.out.println("RECTANGLE");
                System.out.print("Please input the length: ");
                double length = input.nextDouble();
                System.out.print("Please input the width: ");
                double width = input.nextDouble();
                
                Rectangle r = new Rectangle(length,width);
                
                System.out.println("\n\tRectangle with length = " + r.length + " width = " + r.width);
                System.out.println("\tArea = " + d.format(r.computeArea()) + "\n\tPerimeter = " + d.format(r.computePerimeter()));
            } else if(task == 3){
                System.out.println("SQUARE");
                System.out.print("Please input the measure of side: ");
                double side = input.nextDouble();
                
                Square s = new Square(side);
                
                System.out.println("\n\tSquare with side = " + s.side);
                System.out.println("\tArea = " + d.format(s.computeArea()) + "\n\tPerimeter = " + d.format(s.computePerimeter()));
            } else if(task == 4){
                System.out.println("RIGHT TRIANGLE");
                System.out.print("Please input the base: ");
                double base = input.nextDouble();
                System.out.print("Please input the height: ");
                double height = input.nextDouble();
                
                RightTriangle rt = new RightTriangle(base,height);
                
                System.out.println("\n\tRight Triangle  with base = " + rt.base + " height = " + rt.height);
                System.out.println("\tArea = " + d.format(rt.computeArea()) + "\n\tPerimeter = " + d.format(rt.computePerimeter()));
            } else if(task == 0) {
                System.out.println("\n\tThank you for using the program!");   
                break;
            } else {
                System.out.println("Invalid input. Please try again.");               
            }
            
            System.out.print("\nDo you want to continue? 0(No) / 1(Yes) : ");
            ch = input.nextInt();
            System.out.println("\n");
        }while(ch != 0);       
    } //end of main
}

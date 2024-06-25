
import java.text.DecimalFormat;
import java.util.Scanner;

public class UsingRightTriangle {
    public static void main(String[] args){
        DecimalFormat d = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        
        RightTriangle[] rt = new RightTriangle[5];
        
        System.out.println("PROGRAM TO COMPUTE THE AREA OF A RIGHT TRIANGLE");
        
        for(int i=0;i<5;i++){
            rt[i] = new RightTriangle();
            System.out.println("Right Triangle #" + (i+1));
            System.out.print("Please input the base: ");
            rt[i].base = input.nextDouble();

            System.out.print("Please input the height: ");
            rt[i].height = input.nextDouble();
            System.out.println("Base = " + rt[i].base + "; Height = " + rt[i].height + "; Area = " + d.format(rt[i].computeArea()) + "\n");
        }        
    }
}

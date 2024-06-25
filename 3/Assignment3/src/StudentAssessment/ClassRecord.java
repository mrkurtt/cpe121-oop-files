package StudentAssessment;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ClassRecord {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        System.out.println("USTP Academic Solutions Office Student Assessment");
        
        System.out.print("\nMiscellaneous Rate: ");
        Student.miscRate = input.nextDouble();
        
        System.out.print("Total Points: ");
        Student.totalPoints = input.nextInt();
        input.nextLine();//for unwanted enter character
        int assess;
        do{
            System.out.println("\nSTUDENT'S INFORMATION");
            
            System.out.print("Student ID: "); 
            String id = input.nextLine();

            System.out.print("Last Name: "); 
            String lname = input.nextLine();

            System.out.print("First Name: "); 
            String fname = input.nextLine();

            System.out.print("Middle Name: "); 
            String middle = input.nextLine();

            System.out.print("Course: "); 
            String course = input.nextLine();

            System.out.print("Year: "); 
            int year = input.nextInt();

            System.out.print("Total Units: "); 
            int units = input.nextInt();

            Student st = new Student(id,lname,fname,middle,course,year,units);

            System.out.println("\nInput 4 Scores of the Student");
            for(int i=0; i<4; i++){
                System.out.print("Score " + (i+1) + ": ");
                st.scores[i] = input.nextInt();
            }

            System.out.println("\n*********************STUDENT ASSESSMENT*********************\n");
            st.displayInfo();
            System.out.println("Miscellaneous Fee: \t\t\tPhp " + d.format(st.computeMiscellaneous()));
            System.out.println("Amount to pay (4 installments): \tPhp " + d.format((st.misc/4)));
            System.out.println("\n************************************************************\n");
            System.out.print("\n\nPayment Option \n(1) Prelim \n(2) Prelim to Midterm \n(3) Prelim to Pre-Final \n(4) Prelim to Final \n(0) None \n>> ");
            int payment = input.nextInt();
            
            if(payment == 1){
                System.out.println("\n************************************************************");
                System.out.println("Misc Fee paid \t\t\t\t[Prelim]");
                System.out.println("Remaining balance:  \t\t\tPhp " + d.format((st.misc - (st.misc/4))));
                System.out.println("************************************************************");
            }else if(payment == 2){
                System.out.println("\n************************************************************");
                System.out.println("Misc Fee paid \t\t\t\t[Prelim,Midterm]");
                System.out.println("Remaining balance:  \t\t\tPhp " + d.format((st.misc - (2*(st.misc/4)))));
                System.out.println("************************************************************");
            } else if(payment == 3){
                System.out.println("\n************************************************************");
                System.out.println("Misc Fee paid \t\t\t\t[Prelim,Midterm,Pre-final]");
                System.out.println("Remaining balance:  \t\t\tPhp " + d.format((st.misc - (3*(st.misc/4)))));
                System.out.println("************************************************************");
            }else if(payment == 4){
                System.out.println("\n************************************************************");
                System.out.println("Misc Fee paid \t\t\t\t[Prelim,Midterm,Pre-final, Final]");
                System.out.println("Remaining balance:  \t\t\tPhp " + d.format((st.misc - (4*(st.misc/4)))));
                System.out.println("************************************************************");
            }else if(payment == 0){
                System.out.println("************************************************************");
                System.out.println("Misc Fee unpaid \t\t\t[Prelim,Midterm,Pre-final]");
                System.out.println("Remaining balance:  \t\t\tPhp " + d.format((st.misc)));
                System.out.println("************************************************************");
            }   
            
            System.out.print("\n\nAssess another student? 0 (No) 1 (Yes) : ");
            assess = input.nextInt();
            input.nextLine();   //for unwanted enter character
            
        }while(assess != 0);
        
        System.out.println("\nStudent Assessment finished.");
    }

}

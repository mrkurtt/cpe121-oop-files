package StudentAssessment;
import java.text.DecimalFormat;

public class Student {
    DecimalFormat d = new DecimalFormat("0.00");
    
    public String idNo, firstName, middleName,lastName,course;
    public int yearLevel,totalUnits;
    public double overallGrade, misc;
    public int[] scores = new int[4];
    public double[] gradings = new double[4];    
    
    static int totalPoints;
    static double miscRate;
    
    Student(String id,String lname, String fname, String mid, String crse, int year, int units){
        idNo = id;
        firstName = fname;
        middleName = mid;
        lastName = lname;
        course = crse;
        yearLevel = year;
        totalUnits = units;
    }

    public double computeMiscellaneous(){
        return misc = totalUnits * miscRate;
    }    
 
    public double computeOverallGrade(){
        for(int i=0; i<4; i++){
            gradings[i] = (Double.valueOf(scores[i]) /Double.valueOf(totalPoints))*100;
        }
        return overallGrade = (.1*gradings[0]) + (.2*gradings[1]) + (.3*gradings[2]) + (.4*gradings[3]);
    }
    
    public void displayInfo(){
        System.out.println("ID: \t\t\t\t\t" + idNo);
        System.out.println("Name: \t\t\t\t\t" + lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        System.out.println("Course/Year: \t\t\t\t" + course + "-" + yearLevel);
        System.out.println("Overall Grade: \t\t\t" + d.format(computeOverallGrade()));               
        
    }
}

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner S =new Scanner(System.in);
        System.out.println("Enter the Patient name");
        String Patientname=S.nextLine();
        System.out.println("Enter the Height of Paitent");
        Double Height = S.nextDouble();
        System.out.println("enter the Width of paitent");
        double width = S.nextDouble();
        System.out.println("Enter the Weight of a Paitent");
        int weight=S.nextInt();


        double BMI=weight/(Height*Height);


        System.out.println("                        Deitals of Paitent");
        System.out.println();
        System.out.println("Paitent Name   |  "+  "Paitent Height  |   "+  "   Paitent Width    |"+ "     Patient Weight" + "  |   Patient BMI");
        System.out.println(Patientname+"             "+Height+"               "    + width+     "                   "+weight+"                  "+BMI);





    }
}

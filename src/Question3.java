import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter Your Gender\n" +
                "If you are male press M" +
                "     If you are female press f");
        Scanner S=new Scanner(System.in);
        char gender=S.next().charAt(0);


//        char gender=Char.parsec(args[0]);
//        String name = args[0];
////        System.out.println(args[0]);
        if (gender == "m"){
            System.out.println("Ibad");
//        }
    }
}

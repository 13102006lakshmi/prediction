import java.util.Scanner;

public class Prediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Prediction: Student will PASS");
        } else {
            System.out.println("Prediction: Student may FAIL");
        }

        sc.close();
    }
}

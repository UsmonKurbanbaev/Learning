import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String in1 = in.nextLine();
        String in2 = in.nextLine();
        double n1 = Double.parseDouble(in1);
        double n2 = Double.parseDouble(in2);
        double result = n1 + n2;
        System.out.println("The answer is " + result);
    }
}

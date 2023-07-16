import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        try {

            method(number);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Ok");
        }

    }

    public static void method(int number){
        int num = 1;
        for (int i = 1; i <= number; i++) {
            num *= i;
        }
            if (number > 1) {
                System.out.println(num);
            } else {
                throw new RuntimeException("Tuura emes san");
            }
    }

}



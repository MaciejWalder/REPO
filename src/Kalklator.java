import java.util.Scanner;

public class Kalklator {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą cyfrę");
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        System.out.println("Podaj drugą cyfrę");
        int number2=scanner.nextInt();
        System.out.println("Podaj trzecią cyfrę");
        int number3=scanner.nextInt();
        System.out.println("Suma "+(number1+number2+number3));
    }
}

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą cyfrę");
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        System.out.println("Podaj drugą cyfrę");
        int number2=scanner.nextInt();
        if(number1>number2&&number1<5) {
            System.out.println(number1+" Jest mniejsza od 5");
        }else {
            System.out.println("Nie wiem co to za wynik jest");
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String name=scanner.nextLine();
        System.out.println("Podaj swoj wiek");
          int age=scanner.nextInt();
          System.out.println(("Czesc mam na imie "+name +" i mam "+ age +" lat"));

    }

}
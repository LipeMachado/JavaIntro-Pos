import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args) {
        System.out.println("Escreva seu nome: ");
        String name;
        Scanner inputUser = new Scanner(System.in);
        name = inputUser.next();
        System.out.println("Olá, " + name);
    }
}

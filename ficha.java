package j04_individuo;
import java.util.Scanner;

import static java.lang.String.format;

public class ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("informe o dia do seu nascimento: ");
        int dia = sc.nextInt();

        System.out.println("informe o mês que você nasceu? ");
        int mes = sc.nextInt();

        System.out.println("informe o ano em que você nasceu ");
        int ano = sc.nextInt();

        String mensagem = String.format("Olá %s! Você nasceu em %02d/%02d/%d. ", nome, dia, mes, ano);
        System.out.println(mensagem);
    }
}

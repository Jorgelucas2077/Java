package variaveis;

import java.util.Scanner;

public class testandoVariaveis1 {
    public static void main(String[] args) {

        System.out.println("Testando condicionais");
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int idade = scan.nextInt();

        if (idade >= 18) {

            System.out.println("Você tem mais de 18 anos e pode comprar bebidas");

        } else {

            System.out.println("Quantos adultos estão acompanhados com você?");
            int adulto = scan.nextInt();

            if (adulto >= 1) {

                System.out.println("Você é menor de idade e está acompanhada de um adulto, você pode comprar bebidas");

            } else {

                System.out.println(
                        "Você tem menos de 18 anos, não está acompanhada de um adulto e não pode comprar bebidas");

            }

        }
    }

}

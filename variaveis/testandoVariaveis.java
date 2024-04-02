package variaveis;

public class testandoVariaveis {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 18;
        int quantidadePessoa = 2;
        if (idade >= 18) {

            System.out.println("Você tem mais de 18 anos");

        } else {
            if (quantidadePessoa >= 2) {
                System.out.println("Você é menor de idade e está acompanhada de um adulto");
            } else {
                System.out.println("Você tem menos de 18 anos");
                System.out.println("Você não tem 18 anos e não está acompanhado");
            }

        }
    }

}

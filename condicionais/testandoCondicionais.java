package condicionais;

public class testandoCondicionais {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 10;
        int quantidadePessoa = 1;

        if (idade >= 18 || quantidadePessoa >= 2) {
            System.out.println("Você pode comprar bebidas");
        } else {
            System.out.println("Você não tem 18 anos e não está acompanhado");
        }

    }
}

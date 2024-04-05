package javaBank;

public class criarContas {
    public static void main(String[] args) {
        conta primeiraConta = new conta();
        primeiraConta.deposita(200);
        System.out.println("O saldo da primeira conta é: " + +primeiraConta.getSaldo() + " Reais");

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        conta segundaConta = new conta();
        segundaConta.deposita(50);
        System.out.println("O saldo da segunda conta é: " + +segundaConta.getSaldo() + " Reais");

        System.out.println(
                "Saldo primeira conta: " + primeiraConta.getSaldo() + "\b\n" + "Saldo segunda conta: "
                        + segundaConta.getSaldo());

        System.out.println(segundaConta.getnumero());
    }
}

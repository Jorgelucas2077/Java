package javaBank;

public class testeReferencia {
    public static void main(String[] args) {

        conta primeiraContas = new conta();

        primeiraContas.deposita(300);
        System.out.println("O saldo da primeira conta é: " + primeiraContas.getSaldo());

        conta segundaContas = new conta();

        System.out.println("O saldo da segunda conta é:" + segundaContas.getSaldo());

        segundaContas.deposita(100);
        System.out.println("O saldo da primeira conta é: " + primeiraContas.getSaldo());

        if (primeiraContas == segundaContas) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("Não são a mesma conta");
        }

        System.out.println(primeiraContas);
        System.out.println(segundaContas);
    }

}

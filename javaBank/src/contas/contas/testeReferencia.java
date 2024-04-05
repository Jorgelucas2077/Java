package contas

public class testeReferencia {
    public static void main(String[] args) {

        contas primeiraContas = new contas();

        primeiraContas.saldo = 300;
        System.out.println("O saldo da primeira conta é: " + primeiraContas.saldo);

        contas segundaContas = new contas();

        System.out.println("O saldo da segunda conta é:" + segundaContas.saldo);

        segundaContas.saldo += 100;
        System.out.println("O saldo da primeira conta é: " + primeiraContas.saldo);

        if (primeiraContas == segundaContas) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("Não são a mesma conta");
        }

        System.out.println(primeiraContas);
        System.out.println(segundaContas);
    }

}

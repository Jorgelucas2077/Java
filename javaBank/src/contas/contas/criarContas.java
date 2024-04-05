package contas.contas;

public class criarContas {
    public static void main(String[] args) {
        contas primeiraContas = new contas();
        primeiraContas.saldo = 200;
        System.out.println("O saldo da primeira conta é: " + +primeiraContas.saldo + " Reais");

        primeiraContas.saldo += 100;
        System.out.println(primeiraContas.saldo);

        contas segundaContas = new contas();
        segundaContas.saldo = 50;
        System.out.println("O saldo da segunda conta é: " + +segundaContas.saldo + " Reais");

        System.out.println(
                "Saldo primeira conta: " + primeiraContas.saldo + "\b\n" + "Saldo segunda conta: "
                        + segundaContas.saldo);
    }
}

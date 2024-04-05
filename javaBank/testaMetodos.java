package javaBank;

public class testaMetodos {
    public static void main(String[] args) {
        conta contamatheus = new conta();
        conta contamaria = new conta();

        contamatheus.deposita(100);
        contamatheus.deposita(70);
        System.out.println(contamatheus.getSaldo());

        contamatheus.saca(100);
        System.out.println("O valor do saldo antes da transferência é:" + contamatheus.getSaldo());

        contamaria.deposita(1000);
        System.out.println("O saldo da maria antes da transferência é:" + contamaria.getSaldo());

        contamaria.transfere(300, contamatheus);

        System.out.println("O saldo da maria depois da transferencia é:" + contamaria.getSaldo());
        System.out.println("O saldo do matheus depois da transferencia é:" + contamatheus.getSaldo());

    }

}

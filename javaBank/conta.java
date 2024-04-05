package javaBank;

public class conta {

   private double saldo;
    private int agencia;
    private int numero;
    private cliente titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Há saldo suficiente, saque confirmado.");
            return true;

        } else {
            System.out.println("Não há saldo suficiente, saldo negado.");
            return false;
        }
    }

    public boolean transfere(double valor, conta destino) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }

    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getnumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setTitular(cliente titular) {
        this.titular = titular;
    }
    public cliente getTitular() {
        return titular;
    }
}

// Para realizar uma associação é necessário utilizar a 'classe' ex: contas, e
// para fazer instaciação por referencia se utiliza o '.'
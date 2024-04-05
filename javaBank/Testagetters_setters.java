package javaBank;
public class Testagetters_setters {
    public static void main(String[] args) {
        conta conta = new conta();
        conta.setNumero(13);
        System.out.println(conta.getnumero());

        cliente cliente = new cliente();
        conta.setTitular(cliente);
        cliente.setcPF("111.1111.111-11");
       
        System.out.println(conta.getTitular().getCPF());
    }
    
}

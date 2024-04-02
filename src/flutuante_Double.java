package src;
public class flutuante_Double {
    public static void main(String[] args) {
        
        double conta1 = 3;
        System.out.println(conta1);

        double conta2 = 1 - 0.7;
        System.out.println(conta2);

        int conta3 = 5 / 6;
        System.out.println(conta3);

        //Torna-se interessante adicionar os ''0'' em double o resultado exato.
        //Caso contrário ele contará de trás pra frente
        double conta4 = 5.0 / 6.0;
        System.err.println(conta4);
    }
    
}

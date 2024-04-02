package src;
public class cast_VariaveisNumericas {
    public static void main(String[] args) {
        
        //Colocar o casting sempre em parenteses, da string, e dos valores.

        //longdouble = 16 casas decimais
        //Double = 8 casas decimais
        //Float = 4 casas decimais
        //Byte = 3 casas decimais (até o numero 127)
        
        // Colocar (int) dentro do int com um valor double, faz com que o programe obrigue o valor rodar em int.
        //O nome desse processo chama-se Casting
      
        //(long, (L)literal é uma variavel utilizada para numero que o int não suporta (32 bits), nunca esqueça que colocar o l no final.
        //O Float sempre deve haver o "f" no final para poder realizar a impressão.
        //Diferença

        double salario = 2700.00;
        int valor = (int)salario;
        System.out.println(valor);

        int valor2 = 90000000;
        System.out.println(valor2);

        long numeroGrande = 151218515112515151l;
        System.out.println(numeroGrande);

        float numeroFlutuante = 3.14f;
        System.out.println(numeroFlutuante);

        short numeroPequeno = 2465;
        System.out.println(numeroPequeno);

        byte numeroMinusculo = 127;
        System.out.println(numeroMinusculo);

    }
    
}

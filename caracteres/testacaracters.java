package caracteres;
public class testacaracters {
    public static void main(String[] args) {
        
        char letra = 'b';
        System.out.println(letra);

        //Em char se for digitado números ele irá de acordo com a numeração do tabela
        char valor = 66;
        System.out.println(valor);

        char valor1 = (char) (valor + 3);
        System.out.println(valor1);

        String mensagem = "Eu estou aprendendo java";
       System.out.println(mensagem);

        mensagem = mensagem + "com jorge" + 2024;
        System.out.println(mensagem);
    }
}

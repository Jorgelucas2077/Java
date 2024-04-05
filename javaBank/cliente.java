package javaBank;

public class cliente {

    private String CPF;
    private String nome;
    private String profissao;
    
public String getCPF() {
    return CPF;
}
public void setcPF(String cPF){
   CPF = cPF;
}
public String getNome() {
    return nome;
}
public String getProfissao() {
    return profissao;
}
public void setprofissao(String profissao){
    this.profissao = profissao;
}
}
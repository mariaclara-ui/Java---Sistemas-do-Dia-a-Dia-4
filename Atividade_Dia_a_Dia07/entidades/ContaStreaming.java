package Atividade_Dia_a_Dia07.entidades;

public class ContaStreaming {
    private String nome;
    private String email;
    private String tipoPlano;
    private double precoBase;

    public ContaStreaming(String nome, String email, String tipoPlano) {
        this.nome = nome;
        this.email = email;
        this.tipoPlano = tipoPlano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipoPlano() {
        return tipoPlano;
    }
    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
    public double getPrecoBase() {
        return precoBase;
    }


    public String esollha(){
        if (tipoPlano.equals("Padrão")){
            System.out.println("Plano padrão escolhido");
        }
        else if (tipoPlano.equals("Premium")){
            System.out.println("Plano premium escolhido");
        }
        else {
            System.out.println("ERRO");
        }
        return esollha();
    }
}


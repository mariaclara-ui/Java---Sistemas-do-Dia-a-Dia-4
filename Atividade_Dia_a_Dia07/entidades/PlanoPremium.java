package Atividade_Dia_a_Dia07.entidades;

public class PlanoPremium extends ContaStreaming{
    private String qualidadeVideo="4K Ultra HD";
    private int limiteTelas = 4;
    public PlanoPremium(String nome, String email, String tipoPlano){
        super(nome,email,tipoPlano);

    }
    @Override
    public int precoBase() {
        return 50;
    }
    @Override
    public String Recibo() {
        return "Plano Premiun preço:" + precoBase() + " Qualidade: " +qualidadeVideo+ "disponibilidade de "+limiteTelas+" telas e assistir" ;
    }

}

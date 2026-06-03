package Atividade_Dia_a_Dia07.entidades;

public class PlanoPadrao extends ContaStreaming {
    private String qualidadeVideo="Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String email, String senha, int precoBase) {
        super(email);
        }

    @Override
    public double getPrecoBase() {
        return super.getPrecoBase();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getTipoPlano() {
        return super.getTipoPlano();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public int getLimiteTelas() {
        return limiteTelas;
    }

    public String getQualidadeVideo() {
        return qualidadeVideo;
    }

}

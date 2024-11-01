package Classes;


public class Recomendacoes {
    
    private String manutencao;
    private String recomendacaoExtra;

    //Construtores
    
    public Recomendacoes(){
    }
    public Recomendacoes(String manutencao){
        this.manutencao = manutencao;
    }
    public Recomendacoes(String manutencao, String recomendacaoExtra) {
        this.manutencao = manutencao;
        this.recomendacaoExtra = recomendacaoExtra;
    }


    //Getters e Setters

    public String getManutencao() {
        return manutencao;
    }
    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }
    public String getRecomendacaoExtra() {
        return recomendacaoExtra;
    }
    public void setRecomendacaoExtra(String recomendacaoExtra) {
        this.recomendacaoExtra = recomendacaoExtra;
    }

    
}

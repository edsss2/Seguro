package Classes;


public class Descricao{

    //ainda precisa formatar esses dados em formato de data
    private String dataAcidente;
    private String horaAcidente;
    
    private String descricao;

    //Construtores

    public Descricao(){
    }
    public Descricao(String dataAcidente, String horaAcidente, String descricao) {
        this.dataAcidente = dataAcidente;
        this.horaAcidente = horaAcidente;
        this.descricao = descricao;
    }


    //Getters e Setters

    public String getDataAcidente() {
        return dataAcidente;
    }

    public void setDataAcidente(String dataAcidente) {
        this.dataAcidente = dataAcidente;
    }

    public String getHoraAcidente() {
        return horaAcidente;
    }

    public void setHoraAcidente(String horaAcidente) {
        this.horaAcidente = horaAcidente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    


}

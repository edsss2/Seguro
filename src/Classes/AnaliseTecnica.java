package Classes;


public class AnaliseTecnica {
    
    private String CausasIncidente;
    private String CondicoesUso;

    //Construres

    public AnaliseTecnica() {
    }
    
    public AnaliseTecnica(String causasIncidente, String condicoesUso) {
        CausasIncidente = causasIncidente;
        CondicoesUso = condicoesUso;
    }

    //Getters e Setters
    
    public String getCausasIncidente() {
        return CausasIncidente;
    }
    public void setCausasIncidente(String causasIncidente) {
        CausasIncidente = causasIncidente;
    }
    public String getCondicoesUso() {
        return CondicoesUso;
    }
    public void setCondicoesUso(String condicoesUso) {
        CondicoesUso = condicoesUso;
    }

    
}

package Classes;


public class InspecaoVisual {
    
    private String estadoGeral;
    private String sinaisDeQueima;
    private String componentesAfetados;


    //Construtores
    
    public InspecaoVisual(){
    }
    public InspecaoVisual(String estadoGeral, String sinaisDeQueima, String componentesAfetados) {
        this.estadoGeral = estadoGeral;
        this.sinaisDeQueima = sinaisDeQueima;
        this.componentesAfetados = componentesAfetados;
    }
    

    //Getters e Setters

    public String getEstadoGeral() {
        return estadoGeral;
    }
    public void setEstadoGeral(String estadoGeral) {
        this.estadoGeral = estadoGeral;
    }
    public String getSinaisDeQueima() {
        return sinaisDeQueima;
    }
    public void setSinaisDeQueima(String sinaisDeQueima) {
        this.sinaisDeQueima = sinaisDeQueima;
    }
    public String getComponentesAfetados() {
        return componentesAfetados;
    }
    public void setComponentesAfetados(String componentesAfetados) {
        this.componentesAfetados = componentesAfetados;
    }

    


}

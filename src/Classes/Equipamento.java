package Classes;


public class Equipamento {
    
    private String tipoEquipamento;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private String localUso;
    private String dadoAdicionalEquipamento;

    //Construtores
    public Equipamento(){
    }
    public Equipamento(String tipoEquipamento, String marca, String modelo, String numeroSerie, String localUso) {
        this.tipoEquipamento = tipoEquipamento;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.localUso = localUso;
        this.dadoAdicionalEquipamento = dadoAdicionalEquipamento;
    }
    public Equipamento(String tipoEquipamento, String marca, String modelo, String numeroSerie, String localUso,
            String dadoAdicionalEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.localUso = localUso;
        this.dadoAdicionalEquipamento = dadoAdicionalEquipamento;
    }

    
    //Getters e Setters

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }
    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getLocalUso() {
        return localUso;
    }
    public void setLocalUso(String localUso) {
        this.localUso = localUso;
    }
    public String getDadoAdicionalEquipamento() {
        return dadoAdicionalEquipamento;
    }
    public void setDadoAdicionalEquipamento(String dadoAdicionalEquipamento) {
        this.dadoAdicionalEquipamento = dadoAdicionalEquipamento;
    }
}

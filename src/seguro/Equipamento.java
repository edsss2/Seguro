package seguro;

public class Equipamento {

	private String marca;
	private String modelo;
	private String numeroSerie;
	private String quantia;
	private String tempoUso;
	private String danos;
	
	public Equipamento(String marca, String modelo, String numeroSerie, String quantia, String tempoUso, String danos) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.quantia = quantia;
		this.tempoUso = tempoUso;
		this.danos = danos;
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
	public String getQuantia() {
		return quantia;
	}
	public void setQuantia(String quantia) {
		this.quantia = quantia;
	}
	public String getTempoUso() {
		return tempoUso;
	}
	public void setTempoUso(String tempoUso) {
		this.tempoUso = tempoUso;
	}

	public String getDanos() {
		return danos;
	}

	public void setDanos(String danos) {
		this.danos = danos;
	}
	
	
}

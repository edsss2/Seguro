package seguro;

import java.io.FileInputStream;

public class Equipamento {

	private String marca;
	private String modelo;
	private String numeroSerie;
	private String quantia;
	private String tempoUso;
	private String danos;
	//instanciar um objeto para fluxo de bytes
  	private FileInputStream fis;
  	
  	//variável global para armazenar o tamanho da imagem(bytes)
  	private int tamanho;
  	
  	private byte[] foto;
    
	private int codigoOS;
	
	public Equipamento(String marca, String modelo, String numeroSerie, String quantia, String tempoUso, String danos, FileInputStream fis, int tamanho, int codigoOS) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.quantia = quantia;
		this.tempoUso = tempoUso;
		this.danos = danos;
		this.fis = fis;
		this.tamanho = tamanho;
		this.codigoOS = codigoOS;
	}
	
	
	
	public Equipamento(String marca, String modelo, String numeroSerie, String quantia, String tempoUso, String danos,
			byte[] foto, int codigoOS) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.quantia = quantia;
		this.tempoUso = tempoUso;
		this.danos = danos;
		this.foto = foto;
		this.codigoOS = codigoOS;
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

	public int getCodigoOS() {
		return codigoOS;
	}

	public void setCodigoOS(int codigoOS) {
		this.codigoOS = codigoOS;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	
	
}

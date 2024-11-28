package seguro;

import java.util.Random;

public class Laudo {

	private int codigoOS;
	private String nome;
    private long cnpj;
   
    private String responsavelTecnico;
    private String empresaResponsavelTecnico;
    
    private String endereco;
    private String bairro;
    private String cidade;
    private int cep;
    
    private String dataAcidente;
    private String horaAcidente;
    private String descricao;
    
    private String telefone;
    private String email;
    private String marca;
	private String modelo;
	private String numeroSerie;
	private String quantia;
	private String tempoUso;
	private String danos;
	
	public static int gerarNumeroAleatorio() {
		Random random = new Random();
		return 100000 + random.nextInt(900000);
		
	}
	
	public Laudo(String nome, long cnpj, String responsavelTecnico, String empresaResponsavelTecnico,
			String endereco, String bairro, String cidade, int cep, String dataAcidente, String horaAcidente,
			String descricao, String telefone, String email, String marca, String modelo, String numeroSerie,
			String quantia, String tempoUso, String danos, int codigoOS) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.responsavelTecnico = responsavelTecnico;
		this.empresaResponsavelTecnico = empresaResponsavelTecnico;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.dataAcidente = dataAcidente;
		this.horaAcidente = horaAcidente;
		this.descricao = descricao;
		this.telefone = telefone;
		this.email = email;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.quantia = quantia;
		this.tempoUso = tempoUso;
		this.danos = danos;
		this.codigoOS = codigoOS;
	}





	@Override
	public String toString() {
		return "Laudo [codigoOS=" + codigoOS + ", nome=" + nome + ", cnpj=" + cnpj + ", responsavelTecnico="
				+ responsavelTecnico + ", empresaResponsavelTecnico=" + empresaResponsavelTecnico + ", endereco="
				+ endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", dataAcidente="
				+ dataAcidente + ", horaAcidente=" + horaAcidente + ", descricao=" + descricao + ", telefone="
				+ telefone + ", email=" + email + ", marca=" + marca + ", modelo=" + modelo + ", numeroSerie="
				+ numeroSerie + ", quantia=" + quantia + ", tempoUso=" + tempoUso + ", danos=" + danos + "]";
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public long getCnpj() {
		return cnpj;
	}



	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}



	public String getResponsavelTecnico() {
		return responsavelTecnico;
	}



	public void setResponsavelTecnico(String responsavelTecnico) {
		this.responsavelTecnico = responsavelTecnico;
	}



	public String getEmpresaResponsavelTecnico() {
		return empresaResponsavelTecnico;
	}



	public void setEmpresaResponsavelTecnico(String empresaResponsavelTecnico) {
		this.empresaResponsavelTecnico = empresaResponsavelTecnico;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public int getCep() {
		return cep;
	}



	public void setCep(int cep) {
		this.cep = cep;
	}



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



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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



	public Laudo(int codigoOS) {
		this.codigoOS = codigoOS;
	}

	public int getCodigoOS() {
		return codigoOS;
	}

	public void setCodigoOS(int codigoOS) {
		this.codigoOS = codigoOS;
	}
	
	
}

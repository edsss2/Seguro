package seguro;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

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
	
	 public static void gerarLaudo() {
	        try {
	            String dest = "laudo.pdf"; // Nome do arquivo de saída
	            Document document = new Document();
	            PdfWriter.getInstance(document, new FileOutputStream(dest));

	            // Abrir o documento
	            document.open();

	            // Adicionar título principal
	            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
	            Paragraph titulo = new Paragraph("LAUDO TÉCNICO DE EQUIPAMENTO QUEIMADO", titleFont);
	            titulo.setAlignment(Element.ALIGN_CENTER);
	            document.add(titulo);

	            document.add(Chunk.NEWLINE); // Espaço

	            // Adicionar seção "Dados do Solicitante"
	            Font sectionFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
	            document.add(new Paragraph("- DADOS DO SOLICITANTE:", sectionFont));
	            document.add(new Paragraph("Nome: " ));
	            document.add(new Paragraph("CNPJ: [CNPJ do Solicitante]"));
	            document.add(new Paragraph("Telefones de contato: [Telefone]"));
	            document.add(new Paragraph("E-mail: [Email do Solicitante]"));

	            document.add(Chunk.NEWLINE);

	            // Adicionar seção "Local onde ocorreu o dano"
	            document.add(new Paragraph("- LOCAL ONDE OCORREU O DANO:", sectionFont));
	            document.add(new Paragraph("Endereço: [Endereço]"));
	            document.add(new Paragraph("Bairro: [Bairro]"));
	            document.add(new Paragraph("Cidade: [Cidade] - [Estado]"));
	            document.add(new Paragraph("CEP: [CEP]"));

	            document.add(Chunk.NEWLINE);

	            // Adicionar seção "Dados da Ocorrência"
	            document.add(new Paragraph("- DADOS DA OCORRÊNCIA:", sectionFont));
	            document.add(new Paragraph("Data provável do dano: [Data]"));
	            document.add(new Paragraph("Horário provável do dano: [Horário]"));
	            document.add(new Paragraph("Descrição do ocorrido:"));
	            
	            Paragraph descricao = new Paragraph("[Descrição do ocorrido]");
	            descricao.setFont(FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.DARK_GRAY));
	            document.add(descricao);

	            document.add(Chunk.NEWLINE);


	            // Adicionar Tabela de Equipamentos Danificados
	            document.add(new Paragraph("Equipamentos danificados:", sectionFont));

	            // Criar a tabela
	            float[] columnWidths = {2, 3, 2, 1, 1, 3}; // Definindo a largura das colunas
	            PdfPTable table = new PdfPTable(columnWidths);
	            table.setWidthPercentage(100);
	            table.setSpacingBefore(10f);

	            // Cabeçalho da tabela
	            table.addCell("Marca");
	            table.addCell("Modelo");
	            table.addCell("Número de Série");
	            table.addCell("Quantidade");
	            table.addCell("Tempo de Uso");
	            table.addCell("Danos");

	            // Adicionando dados de exemplo para os equipamentos (substitua pelos dados reais)
	            table.addCell("Intelbras");
	            table.addCell("VHC 1120B 720P");
	            table.addCell("NÃO CONSTA");
	            table.addCell("3 unidades");
	            table.addCell("2 anos");
	            table.addCell("Equipamento não gera imagem.");

	            table.addCell("NetLink");
	            table.addCell("Inverter 22.000BTU");
	            table.addCell("NÃO CONSTA");
	            table.addCell("7 pares e 1 unidade");
	            table.addCell("1 ano");
	            table.addCell("Equipamento não liga, queimado mesmo.");

	            // Adicionar a tabela ao documento
	            document.add(table);

	            // Fechar o documento
	            document.close();
	            System.out.println("PDF criado com sucesso: " + dest);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        try {
	        	Desktop.getDesktop().open(new File("laudo.pdf"));
	        } catch (Exception e2){
	        	
	        }
	        
	        
	        
	    }

	
	
	
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

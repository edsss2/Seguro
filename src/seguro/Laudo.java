package seguro;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
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

import apresentacao.frmPrincipal;
import classes_conexao.EmpresaDAO;
import classes_conexao.EquipamentoDAO;

public class Laudo {

	 public static void gerarLaudo() {
		 
		 int codigoLaudo = frmPrincipal.mostrarCodigoOS(frmPrincipal.codigoOS);
		 EmpresaDAO empresaDAO = new EmpresaDAO();
		 Empresa empresa = empresaDAO.buscarPorOS(codigoLaudo);
		 EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
		 ArrayList<Equipamento> equipamentos = equipamentoDAO.buscarEquipamentosPorOS(codigoLaudo); 
		 
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
	            document.add(new Paragraph("Nome: " + empresa.getNome()));
	            document.add(new Paragraph("CNPJ: " + empresa.getCnpj()));
	            document.add(new Paragraph("Telefones de contato: " + empresa.getTelefone()));
	            document.add(new Paragraph("E-mail: " + empresa.getEmail()));

	            document.add(Chunk.NEWLINE);

	            // Adicionar seção "Local onde ocorreu o dano"
	            document.add(new Paragraph("- LOCAL ONDE OCORREU O DANO:", sectionFont));
	            document.add(new Paragraph("Endereço: " + empresa.getEndereco()));
	            document.add(new Paragraph("Bairro: " + empresa.getBairro()));
	            document.add(new Paragraph("Cidade: " + empresa.getCidade()));
	            document.add(new Paragraph("CEP: " + empresa.getCep()));

	            document.add(Chunk.NEWLINE);

	            // Adicionar seção "Dados da Ocorrência"
	            document.add(new Paragraph("- DADOS DA OCORRÊNCIA:", sectionFont));
	            document.add(new Paragraph("Data provável do dano: " + empresa.getDataAcidente()));
	            document.add(new Paragraph("Horário provável do dano: " + empresa.getHoraAcidente()));
	            document.add(new Paragraph("Descrição do ocorrido: "));
	            
	            Paragraph descricao = new Paragraph(empresa.getDescricao());
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
	            for(Equipamento e : equipamentos) {
	            	table.addCell(e.getMarca());
	            	table.addCell(e.getModelo());
	            	table.addCell(e.getNumeroSerie());
	            	table.addCell(e.getQuantia());
	            	table.addCell(e.getTempoUso());
	            	table.addCell(e.getDanos());
	            }

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
	
}
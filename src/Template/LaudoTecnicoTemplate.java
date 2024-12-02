package Template;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

public class LaudoTecnicoTemplate {
    public static void main(String[] args) {
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
            document.add(new Paragraph("Nome: [Nome do Solicitante]"));
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
    
}


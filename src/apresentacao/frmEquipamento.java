/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apresentacao;

import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import classes_conexao.EquipamentoDAO;
import seguro.Equipamento;
import seguro.Laudo;

/**
 *
 * @author Edsons
 */
public class frmEquipamento extends javax.swing.JFrame {

    /**
     * Creates new form frmEquipamento
     */
	
    public frmEquipamento() {
    	setType(Type.UTILITY);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marcaTxt = new javax.swing.JTextField();
        modeloTxt = new javax.swing.JTextField();
        numeroSerieTxt = new javax.swing.JTextField();
        quantiaTxt = new javax.swing.JTextField();
        tempoUsoTxt = new javax.swing.JTextField();
        danosTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        AddEquipamento = new javax.swing.JButton();
        btnProsseguir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados do Equipamento");
        setResizable(false);

        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel3.setText("Modelo:");

        jLabel5.setText("Número de Série:");

        jLabel7.setText("Quantia:");

        jLabel8.setText("Tempo de Uso:");

        jLabel9.setText("Danos:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        AddEquipamento.setText("Add. Equipamento");
        AddEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEquipamentoActionPerformed(evt);
            }
        });
        
        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });
        
        JButton btnCarrregarImagem = new JButton("Carregar Imagem");
        btnCarrregarImagem.setForeground(SystemColor.textHighlight);
        btnCarrregarImagem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		carregarFoto();
        	}
        });
        
        lblFoto = new JLabel("");
        lblFoto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        lblFoto.setIcon(new ImageIcon(frmEquipamento.class.getResource("/img/9004666_image_photo_picture_gallery_file_icon.png")));
        lblFoto.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnCarrregarImagem)
        					.addGap(30)
        					.addComponent(btnSalvar)
        					.addGap(37)
        					.addComponent(btnProsseguir)
        					.addGap(37)
        					.addComponent(AddEquipamento, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        					.addGap(502))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel5)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(numeroSerieTxt, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel8)
        								.addGap(18)
        								.addComponent(tempoUsoTxt, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel3)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(modeloTxt, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel7)
        								.addPreferredGap(ComponentPlacement.UNRELATED)
        								.addComponent(quantiaTxt, 259, 259, 259))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel2)
        								.addPreferredGap(ComponentPlacement.UNRELATED)
        								.addComponent(marcaTxt, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel9)
        								.addPreferredGap(ComponentPlacement.UNRELATED)
        								.addComponent(danosTxt, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))))
        					.addGap(89)
        					.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
        					.addGap(325))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(marcaTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3)
        						.addComponent(modeloTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(numeroSerieTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(quantiaTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8)
        						.addComponent(tempoUsoTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel9)
        						.addComponent(danosTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(92))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCarrregarImagem)
        				.addComponent(btnSalvar)
        				.addComponent(btnProsseguir)
        				.addComponent(AddEquipamento))
        			.addGap(157))
        );
        getContentPane().setLayout(layout);
        
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed
    
    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	Laudo laudo = new Laudo();
    	laudo.gerarLaudo();
    	this.dispose();
    }

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	
    	int codigoEquipamento = frmPrincipal.mostrarCodigoOS(frmPrincipal.codigoOS);
    	
    	
        
    	Equipamento novoEquipamento = new Equipamento(marcaTxt.getText(), modeloTxt.getText(),numeroSerieTxt.getText(),quantiaTxt.getText(),
        tempoUsoTxt.getText(), danosTxt.getText(), fis, tamanho, codigoEquipamento);
    	EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
    	equipamentoDAO.salvar(novoEquipamento);
    	
    	
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEquipamentoActionPerformed
        
        this.dispose();
        frmEquipamento equipamento = new frmEquipamento();
        equipamento.setVisible(true);
        
    }//GEN-LAST:event_AddEquipamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEquipamento().setVisible(true);
            }
        });
        
    }
    
    private void carregarFoto() {
    	JFileChooser jfc = new JFileChooser();
    	jfc.setDialogTitle("Selecionar imagem");
    	jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagem(*.PNG,*.JPG,*.JPEG)", "png", "jpg", "jpeg"));
    	int resultado = jfc.showOpenDialog(this);
    	if (resultado == JFileChooser.APPROVE_OPTION) {
    		try {
    			fis = new FileInputStream(jfc.getSelectedFile());
    			tamanho = (int) jfc.getSelectedFile().length();
    			Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
    			lblFoto.setIcon(new ImageIcon(foto));
    			lblFoto.updateUI();
    		} catch (Exception e) {
    			System.out.println(e);
    		}
    	}
    	
    }
    
  //instanciar um objeto para fluxo de bytes
  	private FileInputStream fis;
  	
  	//variável global para armazenar o tamanho da imagem(bytes)
  	private int tamanho;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEquipamento;
    private javax.swing.JTextField danosTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JTextField numeroSerieTxt;
    private javax.swing.JTextField quantiaTxt;
    private javax.swing.JTextField tempoUsoTxt;
    private JButton btnSalvar;
    private javax.swing.JButton btnProsseguir;
    private JLabel lblFoto;
}

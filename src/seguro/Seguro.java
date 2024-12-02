/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguro;

import apresentacao.frmPrincipal;
import classes_conexao.LaudoDAO;


/**
 *
 * @author Edsons
 */
public class Seguro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //frmPrincipal frmP = new frmPrincipal(null, true);
       //frmP.setVisible(true);
       
       int codigoLaudo = frmPrincipal.mostrarCodigoOS(frmPrincipal.codigoOS);
       
       LaudoDAO laudoDAO = new LaudoDAO();
       Laudo laudo = laudoDAO.buscarPorOS(codigoLaudo);
       if (laudo == null) {
    	   System.out.println("Laudo não encontrado");
       }else {
    	   System.out.println("Laudo encontrado");
       }
       

       
       
    }
    
}

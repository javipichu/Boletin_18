/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

import javax.swing.JOptionPane;
import boletin_18_1.Persoal;

/**
 *
 * @author jalvarezotero
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoal al1p = new Persoal("698432345","Aestevez@gmail.com");
        Academica al1 = new Academica("Alfredo",5,al1p);
        JOptionPane.showMessageDialog(null, al1);
        Persoal.calcularNota(al1);
        JOptionPane.showMessageDialog(null, al1);
        
        Persoal al2p = new Persoal("632324353","Pmariano@hotmail.es");
        al2p.setCorreo("Pmariano@hotmail.es");
        al2p.setTelefono("632324353");
        Academica al2 = new Academica();
        al2.setNome("Pepe");
        al2.setAlum(al2p);
        JOptionPane.showMessageDialog(null, al2);
        Persoal.calcularNota(al2);
        JOptionPane.showMessageDialog(null, al2);
        
    }
    
}

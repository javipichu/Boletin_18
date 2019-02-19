package boletin_18_1;

import boletin_18.Academica;
import javax.swing.JOptionPane;

public class Persoal {

    private String telefono;
    private String correo;

    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static void calcularNota(Academica alum) {
        float practico;
        float teorico;
        int boletines;
        int nBoletines;
        int trabajo;
        float media;

        do {
            practico = Float.parseFloat(JOptionPane.showInputDialog("Nota do práctico"));
        } while (practico < 1 || practico > 10);

        do {
            teorico = Float.parseFloat(JOptionPane.showInputDialog("Nota do teorico"));
        } while (teorico < 1 || teorico > 10);

        do {
            boletines = Integer.parseInt(JOptionPane.showInputDialog("Boletins feitos"));
        } while (boletines < 1 || boletines > 20);

        nBoletines = boletines / 20 * 100;
        if (nBoletines >= 80) {
            trabajo = 2;
        } else if (nBoletines >= 70) {
            trabajo = 1;
        } else {
            trabajo = 0;
        }

        media = teorico * 0.4f + practico * 0.4f + trabajo;
        media = Math.round(media);

        alum.setNota(media);
    }

    @Override
    public String toString() {
        return "\nTeléfono: " + telefono + "\nCorreo: " + correo;
    }
}

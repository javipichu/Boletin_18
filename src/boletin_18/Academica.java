package boletin_18;

import boletin_18_1.Persoal;





/**
 *
 * @author ecollazodominguez
 */
public class Academica {
    private static int numReferencia = 2018;
    private String nome;
    private float nota;
    private Persoal alum;

    public Academica() {
        numReferencia ++;
    }

    public Academica(String nome, float nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
        numReferencia ++;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }
    
    
    @Override
    public String toString(){
        return "Ref: "+numReferencia+"\nNome: "+nome+"\nNota: "+nota+alum;
    }
}
package boletin_15;

import paquetes.Persoal;

/**
 *
 * @author jalonsoriveiro
 */
public class Academica {
 
    static int numReferencia=2020;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academica(String nome, int nota, Persoal alumno) {
        this.nome = nome;
        if (nota <=10 && nota>=0){
        this.nota = nota;
        }else System.out.println("Nota incorrecta");
        this.alumno = alumno;
        numReferencia=numReferencia+1;
    }

    public Academica() {
        numReferencia=numReferencia+1;
        if (nota <=10 && nota>=0){
        this.nota = nota;
        }else System.out.println("Nota incorrecta");
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public static void setNumReferencia(int numReferencia) {
         numReferencia=numReferencia+1;
        Academica.numReferencia = numReferencia;                
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
         if (numReferencia <=10 && numReferencia>=0){
        this.nota = nota;          
        }else System.out.println("Nota incorrecta");
        
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alumno=" + alumno + '}';
    }
    
    
    
 
    
    
}

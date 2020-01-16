/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_15;

import paquetes.Persoal;
import com.company.Alumno;
/**
 *
 * @author jalonsoriveiro
 */
public class Aplicacion {

    public static void main(String[] args) {
        Persoal alumno1 = new Persoal(9999,"jose@");
       
       String datos=alumno1.toString();
        System.out.println(datos);
        
        Alumno obj = new Alumno(6,5,6,4,"jose");
        
        obj.setNotaPrimeraEvaluacion();
        
        alumno1.se
    }
    
    
    
}

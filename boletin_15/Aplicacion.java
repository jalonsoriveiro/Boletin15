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
         Alumno obj = new Alumno();
       
        Academica nuevaAcademia = new Academica(obj.comprobarNombre(),obj.setNotaPrimeraEvaluacion(),alumno1);
        
        String datos = nuevaAcademia.toString();
        
//           System.out.println(datos);
    
    
    }
    
    
    
}

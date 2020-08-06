/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import controlador.CasaController;
import modelo.Casa;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CasaController obj = new CasaController();
        for(Casa c:obj.getCasa("Violeta")){
            System.out.println(c.getContraseña() + c.getCorreo() +c.getCuenta()+c.getNombre());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import modelo.*;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface interCasa {
    List<Casa> getCasa(String nom); 
    List<Usuarios> getUsuarios();
    int add_User(Casa c);
    int mod_User(Casa c);
    int del_User(String cuenta);
    int add_Usuario(Usuarios u);
    int del_Usuario(String nom);
}

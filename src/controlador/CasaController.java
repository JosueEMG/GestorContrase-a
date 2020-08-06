/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Casa;
import modelo.Usuarios;
import util.MySQLConexion;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CasaController implements interCasa{
    MySQLConexion cn =new MySQLConexion();

    @Override
    public List<Casa> getCasa(String nombre) {
        List<Casa> lis=new ArrayList();
        Connection conn= null;

        try{
        conn=cn.getConexion();
        String sql="select * from cuentas where nombre=?";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1, nombre);
        //esta consuilta se lleva a memoria
        ResultSet rs=st.executeQuery();
	 //Comenzar a leer fila x fila
        while(rs.next()){
	  Casa a=new Casa();
          a.setNombre(rs.getString(1));
          a.setCuenta(rs.getString(2));
          a.setCorreo(rs.getString(3));
          a.setContraseña(rs.getString(4));
	  lis.add(a);
	 }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
	try {
			
	if(conn!= null) conn.close();
	} catch (Exception e2) {}
		}
        return lis;
    }

    @Override
    public int add_User(Casa c) {
        int nro=0;
        Connection conn= null;

        try{
        conn=cn.getConexion();
        String sql="INSERT into cuentas values(?,?,?,?);";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1, c.getNombre());
        st.setString(2, c.getCuenta());
        st.setString(3, c.getCorreo());
        st.setString(4, c.getContraseña());
        //esta consuilta se lleva a memoria
        nro=st.executeUpdate();
	 //Comenzar a leer fila x fila
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
	try {
			
	if(conn!= null) conn.close();
	} catch (Exception e2) {}
		}
        return nro;
    }

    @Override
    public int del_User(String cuenta) {
        int nro=0;
        Connection conn= null;

        try{
        conn=cn.getConexion();
        String sql="delete from cuentas where cuenta=?";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1, cuenta);
        //esta consuilta se lleva a memoria
        nro=st.executeUpdate();
	 //Comenzar a leer fila x fila
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
	try {
			
	if(conn!= null) conn.close();
	} catch (Exception e2) {}
		}
        return nro;
    }

    @Override
    public List<Usuarios> getUsuarios() {
        List<Usuarios> lis=new ArrayList();
        Connection conn= null;

        try{
        conn=cn.getConexion();
        String sql="select * from usuarios";
        PreparedStatement st=conn.prepareStatement(sql);
        //st.setString(1, nombre);
        //esta consuilta se lleva a memoria
        ResultSet rs=st.executeQuery();
	 //Comenzar a leer fila x fila
        while(rs.next()){
	  Usuarios a=new Usuarios();
          a.setNombre(rs.getString(1));
          a.setContraseña(rs.getString(2));
	  lis.add(a);
	 }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
	try {
			
	if(conn!= null) conn.close();
	} catch (Exception e2) {}
		}
        return lis;
    }

    @Override
    public int add_Usuario(Usuarios u) {
        int nro=0;
        Connection conn= null;

        try{
        conn=cn.getConexion();
        String sql="INSERT into usuarios values(?,?)";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1, u.getNombre());
        st.setString(2, u.getContraseña());
        //esta consuilta se lleva a memoria
        nro=st.executeUpdate();
	 //Comenzar a leer fila x fila
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
	try {
			
	if(conn!= null) conn.close();
	} catch (Exception e2) {}
		}
        return nro;
    }

    @Override
    public int del_Usuario(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mod_User(Casa c) {
        int nro=0;
        Connection conn= null;

        try{
        conn=cn.getConexion();
        String sql="update cuentas nombre=?, cuenta=?, correo=? contraseña=? where nombre=?";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1, c.getNombre());
        st.setString(2, c.getCuenta());
        st.setString(3, c.getCorreo());
        st.setString(4, c.getContraseña());
        st.setString(5, c.getNombre());
        //esta consuilta se lleva a memoria
        nro=st.executeUpdate();
	 //Comenzar a leer fila x fila
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
	try {
			
	if(conn!= null) conn.close();
	} catch (Exception e2) {}
		}
        return nro;
    }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

/**
 *
 * @author SENA
 */
public class Empleados {
    private String Nombre;
    private int Nseguridadsocial;
    private String Domicilio;
    
    public void setNombre(String nombreP){
        this.Nombre= nombreP;
    }
    public String getNombre(){
    return this.Nombre;
    }
       public void setNseguridadsocial(int nseguridadsocialP){
        this.Nseguridadsocial= nseguridadsocialP;
    }
    public int getNseguridadsocial(){
    return this.Nseguridadsocial;
    }
    
    public void setDomicilio(String domicilioP){
        this.Domicilio= domicilioP;
    }
    public String getDomicilio(){
    return this.Domicilio;
    }
            
    
}

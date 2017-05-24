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
public class Jefes extends Empleados{
     private String Telefono;
     private Trenes tren1;
     
    public void setTren1(Trenes tren1P){
        this.tren1= tren1P;
    }
    public Trenes getTren1(){
    return this.tren1;
    }
    public void setTelefono(String telefonoP){
        this.Telefono= telefonoP;
    }
    public String getTelefono(){
    return this.Telefono;
    }
}

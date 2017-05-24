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
public class Compañia {
    private Trenes tren1 = new Trenes ();
    
    private Empleados empleado1;
            
    public void setEmpleado1(Empleados empleado1P){
        this.empleado1= empleado1P;
    }
    public Empleados getTEmpleado1(){
    return this.empleado1;
    }
}

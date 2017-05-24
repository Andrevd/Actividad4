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
public class Operarios extends Empleados {
    
    private MaquinaTractora maquinaTractora1;
     
    public void setMaquinaTractor1(MaquinaTractora maquinaTractora1P){
        this.maquinaTractora1= maquinaTractora1P;
    }
    public MaquinaTractora getMaquinaTractora1(){
    return this.maquinaTractora1;
    }
}


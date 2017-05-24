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
public class Compuesto {
    
    private final Sencillo Sencillo1 = new Sencillo();
    
    private String Ida;
    public void setIda(String Ida1p)
    {
    this.Ida= Ida1p;
    }
    public String getIda()
    {
    return Ida;
    }
    
    private String Vuelta;
    public void setVuelta(String  Vuelta1p)
    {
    this.Vuelta=  Vuelta1p;
    }
    public String getVuelta()
    {
    return  Vuelta;
    }
}

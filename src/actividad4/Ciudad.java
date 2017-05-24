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
public class Ciudad {
    
    
    private Tren Trenes1;
    public void setNombre(Tren Trenes1p)
    {
    this.Trenes1 = Trenes1p;
    }
    public Tren getTrenes()
    {
    return Trenes1;
    }
    
    
    
    
    private String Nombre;
    public void setNombre(String Nombre1p)
    {
    this.Nombre = Nombre1p;
    }
    public String getNombre()
    {
    return Nombre;
    }
    
    private int Hora_Entrada;
    public void setHora_Entrada(int Hora_Entrada1p)
    {
    this.Hora_Entrada = Hora_Entrada1p;
    }
    public int getHora_Entrada()
    {
    return Hora_Entrada;
    }
    
    private int Hora_Salida;
    public void setHora_Salida(int Hora_Salida1p)
    {
    this.Hora_Salida= Hora_Salida1p;
    }
    public int getHora_Salida()
    {
    return Hora_Salida;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Viajes {
    
     private Sencillo Sencillo1;
    public void setSencillo1(Sencillo  Sencillo1p){
    
    this.Sencillo1=Sencillo1p;
    }
            public Sencillo getSencillo1(){
            return Sencillo1;
            }
    
     private Compuesto Compuesto1;
    public void setCompuesto1(Compuesto Compuesto1p){
    
    this.Compuesto1=Compuesto1p;
    }
            public Compuesto getCompuesto1(){
            return Compuesto1;
            }
            
            
            
            private Trenes Trenes1;
    public void setTrenes1(Trenes  Trenes1p){
    
    this.Trenes1=Trenes1p;
    }
            public Trenes getTrenes1(){
            return Trenes1;
            }
            
                    private Incidentes Incidentes1;
    public void setIncidentes1(Incidentes  Incidentes1p){
    
    this.Incidentes1=Incidentes1p;
    }
            public Incidentes getIncidentes1(){
            return Incidentes1;
            }
            
            
            
    
            
    
    private String Identificador;
    public void setIdentificador(String Identificadorp)
   {
   this.Identificador=Identificadorp;
   }
   public String getIdentificador()
   {
   return Identificador;
   }
   
      private Date Fecha_de_realizacion;
    public void setFecha_de_realizacion(Date Fecha_de_realizacionp)
   {
   this.Fecha_de_realizacion=Fecha_de_realizacionp;
   }
   public Date getFecha_de_realizacion()
   {
   return Fecha_de_realizacion;
   }
   
     private int NmaximoPasajeros;
    public void setNmaximoPasajeros(int NmaximoPasajerosp)
   {
   this.NmaximoPasajeros=NmaximoPasajerosp;
   }
   public int getNmaximoPasajeros()
   {
   return NmaximoPasajeros;
   }
    private int Horario;
    public void setHorario(int Horariop)
   {
   this.Horario=Horariop;
   }
   public int getHorario()
   {
   return Horario;
   }
}

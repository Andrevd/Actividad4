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
public class Sencillo extends Viajes {
    
    
    
    private Ciudad Ciudad1;
    public void setCiudad1(Ciudad  Ciudad1p){
    
    this.Ciudad1=Ciudad1p;
    }
            public Ciudad  getCiudad1(){
            return Ciudad1;
            }
            
            
            
     private String Ciudad_Partida;
    public void setCiudad_Partida(String Ciudad_Partidap)
   {
   this.Ciudad_Partida=Ciudad_Partidap;
   }
   public String getCiudad_Partida()
   {
   return Ciudad_Partida;
   }
   
      private String Ciudad_Destino;
    public void setCiudad_Destino(String Ciudad_Destinop)
   {
   this.Ciudad_Destino=Ciudad_Destinop;
   }
   public String getCiudad_Destino()
   {
   return Ciudad_Destino;
   }
   
   
    
   
   
}

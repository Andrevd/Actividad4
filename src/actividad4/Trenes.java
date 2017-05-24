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
public class Trenes {
          private Vagon Vagon1;
    public void setVagon1(Vagon  Vagon1p){
    
    this.Vagon1=Vagon1p;
    }
            public Vagon getVagon1(){
            return Vagon1;
            }
            
            
                    private MaquinaTractora MaquinaTractora1;
    public void setMaquinaTractora1(MaquinaTractora MaquinaTractora1p){
    
    this.MaquinaTractora1=MaquinaTractora1p;
    }
            public MaquinaTractora getMaquinaTractora1(){
            return MaquinaTractora1;
            }
    
    
    
         private int Codigo;
    public void setCodigo(int Codigop)
   {
   this.Codigo=Codigop;
   }
   public int getCodigo()
   {
   return Codigo;
   }
}

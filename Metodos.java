/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author jorjuela
 */
public class Metodos {
    
   private String cadena;
   private double resultado;
   private boolean suma;
   private boolean resta;
   private boolean multiplicacion;
   private boolean division;
   private boolean raiz;
   private boolean seno;
   private boolean coseno;
   private boolean tangente;
   private boolean iva;
   private boolean reset;

   private boolean alapotencia;
   
   
   public Metodos(){
   
       cadena="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       alapotencia=false;
       iva=false;
       reset=false;
   
   }
   
   public String unir (String cadena){
   
       this.cadena=this.cadena+cadena;
       return this.cadena;
       
   
   }
   
   public void suma(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       suma=true;
       this.cadena="";
   
   }
   
    public void resta(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       resta=true;
       this.cadena="";
   
   }
    
     public void multiplicacion(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       multiplicacion=true;
       this.cadena="";
   
   }
     
      public void division(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       division=true;
       this.cadena="";
   
   }
      
       public void raiz(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       raiz=true;
       this.cadena="";
   
   }
       
        public void seno(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       seno=true;
       this.cadena="";
   
   }
        
         public void coseno(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       coseno=true;
       this.cadena="";
   
   }
         
          public void tangente(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       tangente=true;
       this.cadena="";
   
   }
          
    
              
               public void alapotencia(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       alapotencia=true;
       this.cadena="";
   
   }
               public void iva (String cadena){
                   this.resultado=Double.parseDouble(cadena);
                   iva=true;
                   this.cadena="";
               }
               public void reset (String candea){
                   this.resultado=Double.parseDouble(cadena);
                   this.cadena="";
               }
   
////////////////////////////////////////////////////////////////////////////////////////////////
               
   public double resultado(String numero){
   
       if(suma==true){
           
       resultado=resultado + Double.parseDouble(numero);
       
       }
       
       else if(resta==true){
           
       resultado=resultado-Double.parseDouble(numero);
       
       }
       
           else if(multiplicacion==true){
           
       resultado=resultado*Double.parseDouble(numero);
       
       }
       
           else if(division==true){
           
       resultado=resultado/Double.parseDouble(numero);
       
       }
       
           else if(raiz==true){
           
       resultado=Math.sqrt(Double.parseDouble(numero));
       
       }
       
           else if(seno==true){
           
               double seno=Math.toRadians(resultado);
               resultado=Math.sin(seno);
           }
       
        else if(coseno==true){
           
               double coseno=Math.toRadians(resultado);
               resultado=Math.cos(coseno);
           }
       
        else if(tangente==true){
           
               double tangente=Math.toRadians(resultado);
               resultado=Math.tan(tangente);
           }
       
       
       
        else if(alapotencia==true){
        
            resultado=Math.pow(resultado, Double.parseDouble(numero));
        }
        else if(iva==true){
            resultado=Double.parseDouble(numero)*resultado/100;
       
   }
        else if(reset=true){
            resultado=0;
        }
       
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       alapotencia=false;
       iva=false;
       reset=false; 
       return resultado;
       
   }

    String concatenamiento(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
               
    
}

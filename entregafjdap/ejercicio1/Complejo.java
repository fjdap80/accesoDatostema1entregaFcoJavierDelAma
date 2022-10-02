package main.entregafjdap.ejercicio1;
    /**
 * @author FJDAP
 * @since sept 2022
*/
public class Complejo { 
    
    //Atributos
    double dPReal;
    double dPImag;
    double suma;

    //Constructor 
    public Complejo() {
        dPReal = 0;
        dPImag = 0;
    }

    //Constructor que inicializa los atributos a los valores indicados por los parámetros.
    public Complejo(double paramreal, double paramimag) {
        this.dPReal = paramreal;
        this.dPImag = paramimag;
    }

    //métodos
    
    public double consulta_Real() {
        return dPReal;
    }
    
    public double consulta_Imag() {
        return dPImag;
    }
    
    public void cambia_Real(double paramreal) {
        this.dPReal = paramreal;
    }
   
    public void cambia_Imag(double paramimag) {
        this.dPImag = paramimag;
    }    

    
    public void Complejosumar() {       
     suma=this.dPImag+this.dPReal;        
    }
        
    public String imprimir() {
        return "Complejo dPReal= "+ dPReal + "dPImag= "+ dPImag +"suma= " + suma;
    }

    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + ", suma=" + suma + "]";
    }
    
}
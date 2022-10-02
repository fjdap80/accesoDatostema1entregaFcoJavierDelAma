package main.entregafjdap.ejercicio2;

public class Portatil extends Ordenador{

    /*atributos */
    private int iPeso;
    
    /*constructores */

    Portatil(int paramCodigo, int paramRam, int paramCpu, int paramPrecio, int paramPeso){
    super(paramCodigo, paramRam,paramCpu,paramPrecio);
    this.iPeso=paramPeso;
    }
    /*metodos */

    @Override
    public String toString() {
        return super.toString()+"Portatil [iPeso=" + iPeso + "]";
    }
    public int getsPeso(){
        return iPeso;
    }
}

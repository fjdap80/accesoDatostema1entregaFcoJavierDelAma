package main.entregafjdap.ejercicio2;

public class Ordenador {

    /*atributos */
    private int iCodigo;
    private int iRam;
    private int iCpu;
    private double dPrecio;

    /*constructores */    

    //CON PARÁMETROS
    public Ordenador(int paramCodigo, int paramRam, int paramCpu, int paramPrecio){
        this.iCodigo=paramCodigo;
        this.iRam=paramRam;
        this.iCpu=paramCpu;
        this.dPrecio=paramPrecio;
    }

    /*metodos */  

    @Override
    public String toString() {
        return "Ordenador [dPrecio=" + dPrecio + ", iCodigo=" + iCodigo + ", iCpu=" + iCpu + ", iRam=" + iRam + "]";
    }

    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public void setiRam(int iRam) {
        this.iRam = iRam;
    }

    public int getiCpu() {
        return iCpu;
    }

    public void setiCpu(int iCpu) {
        this.iCpu = iCpu;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    



    
}

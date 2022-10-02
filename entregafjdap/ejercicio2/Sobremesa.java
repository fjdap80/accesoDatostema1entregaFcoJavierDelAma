package main.entregafjdap.ejercicio2;

public class Sobremesa extends Ordenador{

    /*atributos */
    private String sTipoTorre;

    /*constructores */
    Sobremesa (int paramCodigo, int paramRam, int paramCpu, int paramPrecio, String paramTipoTorre){
        super(paramCodigo, paramRam,paramCpu,paramPrecio);
        this.sTipoTorre=paramTipoTorre;
        }
    /*metodos */

    @Override
    public String toString() {
        return super.toString()+"Sobremesa [sTipoTorre=" + sTipoTorre + "]";
    }
    public String getsTipoTorre(){
        return sTipoTorre;
    }
    
}

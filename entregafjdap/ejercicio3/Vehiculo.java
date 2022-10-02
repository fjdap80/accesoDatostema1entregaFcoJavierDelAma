package main.entregafjdap.ejercicio3;
import java.util.*;
public class Vehiculo {

    //atributos
    private String sMatricula;
    private Date dFechaIni;
    private Date dFechaFin;    

    //constructor
    public Vehiculo(String paramMatricula, int paramAgno, int paramMes, int paramDia){
        sMatricula=paramMatricula;
        GregorianCalendar calendario = new GregorianCalendar(paramAgno,paramMes - 1,paramDia);
		dFechaIni = calendario.getTime();
        dFechaFin=calendario.getTime();
    }

    //métodos
    public String getsMatricula() {
        return sMatricula;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public Date getdFechaIni() {
        return dFechaIni;
    }

    public void setdFechaIni(Date dFechaIni) {
        this.dFechaIni = dFechaIni;
    }

    public Date getdFechaFin() {
        return dFechaFin;
    }

    public void setdFechaFin(Date dFechaFin) {
        this.dFechaFin = dFechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [sMatricula=" + sMatricula + ", dFechaIni=" + dFechaIni + ", dFechaFin=" + dFechaFin + "]";
    }   
            
    
}

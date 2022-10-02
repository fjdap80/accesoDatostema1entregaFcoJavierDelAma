package main.entregafjdap.ejercicio3;

public class ParkingVehiculo implements Parking {

    //CONSTANTE
    public static final double PRECIOMIN=0.0425;
    public static final int PLAZAS=100;

    //atributos
    public String sDireccion;
    public int iPlazasOcup;

    //contructor
    public ParkingVehiculo(String paramDireccion){
        this.sDireccion=paramDireccion;

    }

    @Override
    public boolean aparcaCoche() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double getFactura() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean hayPlaza() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean sacaCoche() {
        // TODO Auto-generated method stub
        return false;
    }
  
        
        
    }
 
    


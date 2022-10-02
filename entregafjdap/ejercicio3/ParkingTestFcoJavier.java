package main.entregafjdap.ejercicio3;

public class ParkingTestFcoJavier {

    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args)throws Exception{

        System.out.println("Inicio ParkingTest");
        try{
            Vehiculo coche1=new Vehiculo("1234LZP");
            ParkingVehiculo parkingCortes=new ParkingVehiculo("Cortes 1 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //espero 2 minutos
            Thread.sleep(120*1000);
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+ "Factura= "+dFactura);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}

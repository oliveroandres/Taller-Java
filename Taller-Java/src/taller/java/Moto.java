//Andres Olivero
//Mauricio Vergara
package taller.java;
public class Moto extends Vehiculo {
    
    public Moto(String Marca, String Numerodeserie, double Cantidaddecombustibleactual, double Kilometrosrecorridos, String Placa) {
        super(Marca, Numerodeserie, Cantidaddecombustibleactual, Kilometrosrecorridos, Placa);
    }
    public String mostrar(){
    String resultado="";
    resultado = mostrarinfo();
    return resultado;
    }

}

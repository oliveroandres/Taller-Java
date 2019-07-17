//Andres Olivero
//Mauricio Vergara
package taller.java;
public class Carroturismo extends Vehiculo {
private String Tipo;
private String Tipomotor;

    public Carroturismo(String Marca, String Numerodeserie, double Cantidaddecombustibleactual, double Kilometrosrecorridos, String Placa,String Tipo,String Tipomotor) {
        super(Marca, Numerodeserie, Cantidaddecombustibleactual, Kilometrosrecorridos, Placa);
        this.Tipo=Tipo;
        this.Tipomotor=Tipomotor;
    }
    public String mostrar(){
    String  resultado="";
    resultado=mostrarinfo()+"\t"+Tipo+"\t"+Tipomotor;
    return resultado;
    }
}

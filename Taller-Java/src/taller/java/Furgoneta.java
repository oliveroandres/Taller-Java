//Andres olivero
//Mauricio Vergrara
package taller.java;
public class Furgoneta extends Vehiculo {
    private double Capacidaddecarga;
    private double altura;
    public Furgoneta(String Marca, String Numerodeserie, double Cantidaddecombustibleactual, double Kilometrosrecorridos, String Placa, double Capacidaddecarga,double altura) {
        super(Marca, Numerodeserie, Cantidaddecombustibleactual, Kilometrosrecorridos, Placa);
     this.Capacidaddecarga=Capacidaddecarga;
     this.altura=altura;
     
    }
    
    public String mostrar(){
    String resultado="";
    resultado =mostrarinfo()+"\t"+Capacidaddecarga+"\t"+altura;
    return resultado;
    }
}

//Andres Olivero
//Mauricio Vergara
package taller.java;


public class Carrodeportivo extends Vehiculo {
    
    private double Caballosdepotencia;
    private String Turbo;
    private int Numerodepuertas;
    private int Numerodeasientos;
    
    
    public Carrodeportivo(String Marca, String Numerodeserie, double Cantidaddecombustibleactual, double Kilometrosrecorridos, String Placa, double Caballosdepotencia, String Turbo, int Numerodepuertas,int Numerosdeasientos) {
        super(Marca, Numerodeserie, Cantidaddecombustibleactual, Kilometrosrecorridos, Placa);
        this.Caballosdepotencia=Caballosdepotencia;
        this.Turbo=Turbo;
        this.Numerodepuertas=Numerodepuertas;
        this.Numerodeasientos=Numerodeasientos;
        
    }
    
    public String mostrar(){
   String resultado="";
   resultado=mostrarinfo()+"\t"+Caballosdepotencia+"\t"+Turbo+"\t"+Numerodepuertas+"\t"+Numerodeasientos;
   return resultado;
    }
}

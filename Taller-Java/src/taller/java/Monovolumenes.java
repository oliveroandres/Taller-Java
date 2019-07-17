//Andres OLivero
//Mauricio Vergrara
package taller.java;

public class Monovolumenes extends Vehiculo  {
    private double Capacidaddecarga;
    private int Numerodepuertaslaterales;
    private String Tipomotor;
    
    public Monovolumenes(String Marca, String Numerodeserie, double Cantidaddecombustibleactual, double Kilometrosrecorridos, String Placa,double Capacidaddecarga,int Numerodepuertaslaterales,String Tipomotor) {
        super(Marca, Numerodeserie, Cantidaddecombustibleactual, Kilometrosrecorridos, Placa);
    this.Capacidaddecarga=Capacidaddecarga;
    this.Numerodepuertaslaterales=Numerodepuertaslaterales;
    this.Tipomotor=Tipomotor;
    
    }
    public String mostrara(){
    String resultado="";
    resultado=mostrarinfo()+"\t"+Capacidaddecarga+"\t"+Numerodepuertaslaterales+"\t"+Tipomotor;
    return resultado;
    }
    
}

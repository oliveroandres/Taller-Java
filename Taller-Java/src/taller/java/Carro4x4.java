//Andres Olivero
//Mauricio Vergara
package taller.java;

public class Carro4x4 extends Vehiculo{
    private String Tipomotor;
    private int Numeroasientos;
    
            
    public Carro4x4(String Marca, String Numerodeserie, double Cantidaddecombustibleactual, double Kilometrosrecorridos, String Placa, String Tipomotor, int Numeroasientos) {
        super(Marca, Numerodeserie, Cantidaddecombustibleactual, Kilometrosrecorridos, Placa);
        
        this.Tipomotor=Tipomotor;
        this.Numeroasientos=Numeroasientos;
        
        
                
    }
     public String mostrar(){
        
            String resultado="";
            resultado=mostrarinfo()+"\t"+Tipomotor+"\t"+Numeroasientos;
            return resultado;
        }
}

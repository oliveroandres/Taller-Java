//Andres Olivero
//Mauricio Vergara
package taller.java;
public abstract class Vehiculo {
protected String Marca;
protected String Numerodeserie;
protected double Cantidaddecombustibleactual;
protected double Kilometrosrecorridos;
protected String Placa;

public Vehiculo(String Marca,String Numerodeserie,double Cantidaddecombustibleactual,double Kilometrosrecorridos,String Placa ){

 this.Marca=Marca;
 this.Numerodeserie=Numerodeserie;
 this.Cantidaddecombustibleactual=Cantidaddecombustibleactual;
 this.Kilometrosrecorridos=Kilometrosrecorridos;
 this.Placa=Placa;
}

 public String mostrarinfo(){
        String resultado="";
        resultado=Marca+"\t"+Numerodeserie+"\t"+
                Cantidaddecombustibleactual+"\t"+Kilometrosrecorridos+"\t"+Placa;
        return resultado;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setNumerodeserie(String Numerodeserie) {
        this.Numerodeserie = Numerodeserie;
    }

    public void setCantidaddecombustibleactual(double Cantidaddecombustibleactual) {
        this.Cantidaddecombustibleactual = Cantidaddecombustibleactual;
    }

    public void setKilometrosrecorridos(double Kilometrosrecorridos) {
        this.Kilometrosrecorridos = Kilometrosrecorridos;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
 
}

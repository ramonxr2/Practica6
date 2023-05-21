package practica6_herencia;

/**
 *
 * @author JRamR
 */
public class Smartphone extends Computadora{
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;
    
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre,Sensor sensorDeHuella, Pantalla pantalla){
    super(fabricante,numeroSerie,marca,nombre);
    this.sensorDeHuella=sensorDeHuella;
    this.pantalla=pantalla;
    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(getFabricante())
            .append(", Numero de serie: ").append(getNumeroSerie())
            .append(", Marca: ").append(getMarca())
            .append(", Nombre: ").append(getNombre())
            .append("\n Sensor de Huella: ").append(sensorDeHuella)
            .append("\n Pantalla: ").append(pantalla);
        return sb.toString();
    }
}

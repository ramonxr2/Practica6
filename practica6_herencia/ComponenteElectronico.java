package practica6_herencia;

/**
 *
 * @author JRamR
 */
public abstract class ComponenteElectronico extends DispositivoElectronico{
    
    //constructor 1
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
    }
    // constructor 2
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre,costo);
    }
  
    
    
    @Override
    public String toString(){
         StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(getFabricante())
                .append(", Numero de serie: ").append(getNumeroSerie())
                .append(", Marca: ").append(getMarca())
                .append(", Nombre: ").append(getNombre())
                .append(", Costo: ").append(getCosto());
        return sb.toString();
    }
}

package practica6_herencia;

import java.util.ArrayList;

public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    
    protected boolean encendido;
    
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
    }

    //constructor 2
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre,costo);
    }
    //constructor 3
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre,float costo, ArrayList<ComponenteElectronico> componentes) {
        super(fabricante, numeroSerie, marca, nombre,costo, componentes);
        
    }
    //constructor 4 
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre,float costo, ArrayList<ComponenteElectronico> componentes,boolean encendido) {
        super(fabricante, numeroSerie, marca, nombre,costo, componentes);
        this.encendido=encendido;
        
    }
    
    public boolean isEncendido() {
        return encendido;
    }
    
    public void encender(){
    encendido=true;
    }
    
    public void apagar(){
    encendido=false;
    }
    
    @Override
    public String toString(){
  StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(getFabricante())
            .append(", Numero de serie: ").append(getNumeroSerie())
            .append(", Marca: ").append(getMarca())
            .append(", Nombre: ").append(getNombre())
            .append(", Costo: ").append(getCosto())
            .append(", Componentes: ").append(getComponentes())
            .append(", Estado encendido: ").append(encendido);
        return sb.toString();
    }
}

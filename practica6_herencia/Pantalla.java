package practica6_herencia;


public class Pantalla extends ComponenteElectronico{
    
    private final int resolucionX;
    private final int resolucionY;
    
    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo, int resolucionX, int resolucionY) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.resolucionX=resolucionX;
        this.resolucionY=resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }
    
    @Override
    public String toString(){
    return "Fabricante: "+super.getFabricante()+" Numero de serie: "+super.getNumeroSerie()+" Marca: "+super.getMarca()+" Nombre: "+super.getNombre()+" Costo: "+super.getCosto()+" Resolucion horizontal: "+resolucionX+" Resolucion vertical: "+resolucionY;
    }
}

package practica6_herencia;

public class Microprocesador extends ComponenteElectronico{
    
    private final int cacheRAM;
    private final long velocidadHz;
    
    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre,float costo,int cacheRAM, long velocidadHz) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cacheRAM=cacheRAM;
        this.velocidadHz=velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }
    @Override
    public String toString(){
            return "Fabricante: "+super.getFabricante()+" Numero de serie: "+super.getNumeroSerie()+" Marca: "+super.getMarca()+" Nombre: "+super.getNombre()+" Costo: "+super.getCosto()+" Cache de RAM: "+cacheRAM+" Velocidad en Hz: "+velocidadHz;
    }
}

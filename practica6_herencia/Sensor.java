package practica6_herencia;

public class Sensor extends ComponenteElectronico{
    
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;
    
    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, String tipo, String unidadDeMedida, int valor) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.tipo=tipo;
        this.unidadDeMedida=unidadDeMedida;
        this.valor=valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }
    
    @Override
    public String toString(){
        return "Fabricante: "+super.getFabricante()+" Numero de serie: "+super.getNumeroSerie()+" Marca: "+super.getMarca()+" Nombre: "+super.getNombre()+" Costo: "+super.getCosto()+" Tipo: "+tipo+" Unidad de medida: "+unidadDeMedida+" Valor: "+valor;
    
    }
}

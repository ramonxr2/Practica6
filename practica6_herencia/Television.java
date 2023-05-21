package practica6_herencia;


public class Television extends DispositivoElectronicoDeConsumo{
    
    private final Pantalla pantalla;
    public Television(String fabricante, String numeroSerie, String marca, String nombre, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre);
        this.pantalla=pantalla;
    }

     public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre,costo);
        this.pantalla=pantalla;
    }
    
    public Pantalla getPantalla() {
        return pantalla;
    }
    
    @Override
    public String toString(){
   StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(getFabricante())
            .append(", Numero de serie: ").append(getNumeroSerie())
            .append(", Marca: ").append(getMarca())
            .append(", Nombre: ").append(getNombre())
            .append(", Costo: ").append(getCosto())
            .append("\n Detalles de pantalla: ").append(pantalla);
        return sb.toString();    }
}

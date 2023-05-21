package practica6_herencia;

public class Computadora extends DispositivoElectronicoDeConsumo{
    
    private Microprocesador cpu;
    private long ramMB;
    
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
    }

    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }
    
    @Override
    public String toString(){
             return "Fabricante: "+super.getFabricante()+" Numero de serie: "+super.getNumeroSerie()+" Marca: "+super.getMarca()+" Nombre: "+super.getNombre()+" Costo: "+super.getCosto()+" MB de ram: "+ramMB+" Datos del CPU: "+cpu.toString();   
    }
}

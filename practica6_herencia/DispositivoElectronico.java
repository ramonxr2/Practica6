package practica6_herencia;

import java.util.ArrayList;

public abstract class DispositivoElectronico {
    
    protected final String fabricante; //inmutables
    protected final String numeroSerie;
    protected final String marca;
    protected final String nombre;
    protected float costo;//mutable
    protected ArrayList<ComponenteElectronico> componentes; //mutable .. add and remove
    
    public DispositivoElectronico(String fabricante,String numeroSerie, String marca, String nombre){
    this.fabricante=fabricante;
    this.numeroSerie=numeroSerie;
    this.marca=marca;
    this.nombre=nombre;
    }

    public DispositivoElectronico(String fabricante,String numeroSerie, String marca, String nombre, float costo){
    this.fabricante=fabricante;
    this.numeroSerie=numeroSerie;
    this.marca=marca;
    this.nombre=nombre;
    this.costo=costo;
    }
    
    
    public DispositivoElectronico(String fabricante,String numeroSerie, String marca, String nombre, float costo, ArrayList<ComponenteElectronico> componentes){
    this.fabricante=fabricante;
    this.numeroSerie=numeroSerie;
    this.marca=marca;
    this.nombre=nombre;
    this.costo=costo;
    this.componentes=componentes;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<ComponenteElectronico> componentes) {
        this.componentes = componentes;
    }
    
    @Override
    public String toString(){
  StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(fabricante)
            .append(", Numero de serie: ").append(numeroSerie)
            .append(", Marca: ").append(marca)
            .append(", Nombre: ").append(nombre)
            .append(", Costo: ").append(costo)
            .append(", Componentes: ").append(componentes);
        return sb.toString();    }
}

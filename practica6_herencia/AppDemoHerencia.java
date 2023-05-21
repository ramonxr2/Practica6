
package practica6_herencia;
import java.util.ArrayList;
import practica6_herencia.IUclases.MiMouseAdapter;
import practica6_herencia.IUclases.SmartphoneIU;

//clase main
public class AppDemoHerencia {
    
    public static void main(String[] args){
    AppDemoHerencia demo=new AppDemoHerencia();
    demo.programa();
    demo.objetosGraficos();
    }
    
    public void programa(){
    ArrayList<Smartphone> listaDeSmartphones=new ArrayList();
    ArrayList<Television> listaDeTVs= new ArrayList();
                                                                                                                                                                                                                           
    //crear 2 smartphones con atributos completos 
    listaDeSmartphones.add(new Smartphone("Samsung Indonesia","2020312","Samsung","Galaxy S20",new Sensor("Steren","2023","Steren","Sensor Nuevo",500,"Giroscopico","Grados",5),new Pantalla("LG","20314","LG","PANTALLA 7 PULGADAS",3000,1920,1080)));
    listaDeSmartphones.add(new Smartphone("Apple America","99940","Apple","Iphone 14 pro max deluxe",new Sensor("Steren","2023","Steren","Sensor Nuevo",500,"Giroscopico","Grados",5),new Pantalla("Samsung","5642","Samsung","PANTALLA 15 PULGADAS",9000,4080,2080)));

    //crear 2 TVs
    listaDeTVs.add(new Television("LG", "BR3812", "LG", "LG MAXIMUM PRO 70 INCHES" , 9999, new Pantalla("LG","9392AR","LG","PANTALLA 70 PULGADAS",8940,3840,2160)));
    listaDeTVs.add(new Television("TCL", "AKS23P3", "TCL", "TCL DOLBY MOD" , 7000, new Pantalla("TCL","7773MAR","TCL","PANTALLA 50 PULGADAS",4000,3840,2160)));

    //print them
        System.out.println("DATOS DE LOS SMARTPHONES: \n");
    for(Smartphone a: listaDeSmartphones){
        System.out.println(a.toString());
    }
        System.out.println("\n\nDATOS DE LAS TVs: \n");
    for(Television b: listaDeTVs){
        System.out.println(b.toString());
    }
    }
    
    public void objetosGraficos(){
    Smartphone sm= new Smartphone("Samsung Indonesia","2020312","Samsung","Galaxy S20",new Sensor("Steren","2023","Steren","Sensor Nuevo",500,"Giroscopico","Grados",5),new Pantalla("LG","20314","LG","PANTALLA 7 PULGADAS",3000,1920,1080));
    SmartphoneIU smart=new SmartphoneIU("src/practica6_Herencia/smartphonio.png",sm);
        System.out.println("\n\n\n\n EJEMPLO GRAFICO: \n");
    smart.imprimirTelefono(smart);
    
    }
}

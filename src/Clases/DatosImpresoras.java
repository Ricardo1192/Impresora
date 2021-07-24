package Clases;

import java.util.ArrayList;
import java.util.List;

public class DatosImpresoras {
    public DatosImpresoras(){

    }
    private List<Impresora> impresoras= new ArrayList<Impresora>();

    public List<Impresora> consultaImpresoras( ){
        return impresoras;
    }
    public Impresora buscaImpresora(String serial){
        for (Impresora impresora : impresoras) {
            if (impresora.getSerial()== serial) {
                return impresora;
            }
        }
    }
        


}

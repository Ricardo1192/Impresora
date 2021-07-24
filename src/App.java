import Clases.DatosImpresoras;


public class App {
    public static void main(String[] args) throws Exception {
        DatosImpresoras Data= new DatosImpresoras();
        Data.crearImpresora("000", "Epson", true);
        Data.crearImpresora("001", "Hp", true);
        Data.crearImpresora("002", "Apple", false);
        Data.crearImpresora("003", "Samsung", true);
        Data.crearImpresora("004", "Brother", false);
        System.out.println(Data.consultaImpresoras().get(3).getSerial());
        System.out.println(Data.buscaImpresora("000").getMarca());
    }
}

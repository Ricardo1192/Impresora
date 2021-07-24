

public class Impresora {
    private String serial;
    private String marca;
    private boolean escaner;
    
    public Impresora(String serial, String marca, boolean escaner) {
        this.serial = serial;
        this.marca = marca;
        this.escaner = escaner;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEscaner() {
        return escaner;
    }

    public void setEscaner(boolean escaner) {
        this.escaner = escaner;
    }


    
}

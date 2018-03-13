package retur.pant;

public class FlaskeVærdi {

    Type type;
    public double værdi;


    public FlaskeVærdi(Type type, double værdi){
        this.type = type;
        this.værdi = værdi;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getVærdi() {
        return værdi;
    }

    public void setVærdi(double værdi) {
        this.værdi = værdi;
    }





}

public class Coche extends Vehiculo{

    public Coche(int puerta, String color,int num) {
        super(puerta, color,num);
    }

    @Override
    public boolean esCoche() {
        return true;
    }
}

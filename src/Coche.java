public class Coche extends Vehiculo{

    public Coche(int puerta, String color) {
        super(puerta, color);
    }

    @Override
    public boolean esCoche() {
        return true;
    }
}

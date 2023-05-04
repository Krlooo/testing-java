public abstract class Vehiculo {
    int puerta;
    String color;
    Rueda[] ruedas= {new Rueda(),new Rueda(),new Rueda(),new Rueda()};

    public Vehiculo(int puerta, String color) {
        this.setPuerta(puerta);
        this.setColor(color);
    }
    public Vehiculo() {
        this.setPuerta(0);
        this.setColor("Rojo");
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void escribi() {
        System.out.println("Soy un coche con "+this.getPuerta()+" puertas y de color "+this.getColor());
    }

    public boolean esCoche(){
        return false;
    }

    public void estadoRuedas(){
        for(int i = 0; i<ruedas.length;i++ ){
            System.out.println("Rueda "+i+ "está: "+ ruedas[i].estado);
        }
    }
}

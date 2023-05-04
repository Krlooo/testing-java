public class Rueda {
    Estado estado = new Normal();
    public void pinchar(){
        estado = new Pinchado();
    }
}

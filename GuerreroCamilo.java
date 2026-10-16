public class GuerreroCamilo extends Personaje {

    public GuerreroCamilo() {
        super("Guerrero Camilo", 100, 40);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("🔥 " + this.nombre + " da un espadazo a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(this.fuerza);
    }
}
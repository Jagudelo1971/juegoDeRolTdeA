public class TrollCarlos extends Personaje {

    public TrollCarlos() {
        // Invoca al constructor padre: nombre, vida, fuerza
        super("Troll Carlos", 100, 35);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("🔥 " + this.nombre + " golpea con ambas manos y una fuerza brutal a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(this.fuerza);
    }
}

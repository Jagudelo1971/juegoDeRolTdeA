public class HadaIsabella extends Personaje {

    public HadaIsabella() {
        // Invoca al constructor padre: nombre, vida, fuerza
        super("Hada Isabella", 60, 75);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("🪄✨ " + this.nombre + " libera destellos venenosos desde su INCREÍBLE barita a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(this.fuerza);
    }
}
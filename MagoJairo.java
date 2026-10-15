public class MagoJairo extends Personaje {

    public MagoJairo() {
        // Invoca al constructor padre: nombre, vida, fuerza
        super("Mago Jairo", 80, 25);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("🔥 " + this.nombre + " lanza una bola de fuego ancestral a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(this.fuerza);
    }
}

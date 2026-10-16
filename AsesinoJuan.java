public class AsesinoJuan extends Personaje {

    public AsesinoJuan() {
        super("Asesino Juan", 80, 40);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("🔪 " + this.nombre + " lanza un ataque con su cuchillo a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(this.fuerza);
    }
}
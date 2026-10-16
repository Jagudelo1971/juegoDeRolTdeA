public class SemiDiosYeison extends Personaje {

    public SemiDiosYeison() {
        super("Semidiós Yeison", 250, 82);
    }


    @Override
    public void atacar(Personaje objetivo) {
        System.out.println("🔥 " + this.nombre + " lanza un ataque divino y devastador a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(this.fuerza);
    }
}
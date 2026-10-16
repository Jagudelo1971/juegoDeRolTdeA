public class MagoJuanCarvajal extends Personaje {

    public MagoJuanCarvajal(){
        super("Mago JuanCarvajal", 100, 30);
    }


    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.nombre + " !LANZA BOLA DE FUEGO A¡ " + objetivo.getNombre());
        objetivo.recibirDanio(this.fuerza);


    }


}

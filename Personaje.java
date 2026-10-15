public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int fuerza;

    public Personaje(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    // Método abstracto que CADA estudiante debe implementar
    public abstract void atacar(Personaje objetivo);

    public void recibirDanio(int danio) {
        this.vida -= danio;
        System.out.println(this.nombre + " recibió " + danio + " de daño. (Vida restante: " + Math.max(0, this.vida) + ")");
    }

    /**
     * Permite al personaje recuperar vida si su fuerza es mayor
     * que la del enemigo al que acaba de atacar.
     */
    public void evaluarRecuperacionVida(Personaje objetivo) {
        if (this.fuerza > objetivo.fuerza) {
            int puntosRecuperados = 15;
            this.vida += puntosRecuperados; // Modificación directa de su propio atributo

            System.out.println("💚 ¡Efecto Vampírico! Como la fuerza de " + this.nombre +
                               " es mayor que la de " + objetivo.getNombre() +
                               ", recupera " + puntosRecuperados + " de vida. (Vida actual: " + this.vida + ")");
        }
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    // public int getFuerza() { return fuerza; }
    public boolean estaVivo() { return vida > 0; }
}

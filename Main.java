import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Personaje> arenaDeBatalla = new ArrayList<>();

        // ==========================================
        // ESTUDIANTES: Añadan su instancia aquí abajo
        // Ejemplo: arenaDeBatalla.add(new MagoJairo());

        arenaDeBatalla.add(new SemiDiosYeison());

        // ==========================================
        arenaDeBatalla.add(new GuerreroCamilo());
        arenaDeBatalla.add(new MagoJairo());
        arenaDeBatalla.add(new TrollCarlos());
	      arenaDeBatalla.add(new AsesinoJuan());
        arenaDeBatalla.add(new MagoJuanCarvajal());

        // ==========================================
        /*
        System.out.println("⚔️ --- ¡INICIA LA SIMULACIÓN RPG EN VIVO! --- ⚔️\n");
        if (arenaDeBatalla.isEmpty()) {
            System.out.println("No hay personajes en la arena. ¡Esperando Pull Requests!");
            return;
        }

        // Simulación de una ronda rápida de ataques (Polimorfismo)
        for (int i = 0; i < arenaDeBatalla.size(); i++) {
            Personaje atacante = arenaDeBatalla.get(i);
            // Elige al siguiente personaje de la lista como objetivo
            Personaje objetivo = arenaDeBatalla.get((i + 1) % arenaDeBatalla.size());

            if (atacante.estaVivo() && atacante != objetivo) {
                atacante.atacar(objetivo);
                System.out.println("----------------------------------------");
            }
        }
        */

                // ==========================================
        // SIMULACIÓN ACTUALIZADA: Ataques aleatorios hasta la muerte
        // ==========================================
        System.out.println("⚔️ --- ¡INICIA LA SIMULACIÓN RPG EN VIVO! --- ⚔️\n");
        if (arenaDeBatalla.size() < 2) {
            System.out.println("Se necesitan al menos 2 personajes en la arena para iniciar la batalla.");
            return;
        }
        Random random = new Random();
        boolean continuarBatalla = true;
        int ronda = 1;

        while (continuarBatalla) {
            System.out.println("\n=== RONDA " + ronda + " ===");

            // 1. Seleccionar atacante aleatorio
            int indiceAtacante = random.nextInt(arenaDeBatalla.size());
            Personaje atacante = arenaDeBatalla.get(indiceAtacante);

            // 2. Seleccionar objetivo aleatorio diferente al atacante
            int indiceObjetivo;
            do {
                indiceObjetivo = random.nextInt(arenaDeBatalla.size());
            } while (indiceObjetivo == indiceAtacante);
            Personaje objetivo = arenaDeBatalla.get(indiceObjetivo);

            // 3. Ejecutar el ataque si ambos están vivos
            if (atacante.estaVivo() && objetivo.estaVivo()) {
                atacante.atacar(objetivo);

                // Evaluar si el atacante puede recuperar vida (Método solicitado)
                atacante.evaluarRecuperacionVida(objetivo);

                System.out.println("----------------------------------------");
            }

            // 4. Verificar si ALGUN personaje se quedó sin vida para detener la simulación
            for (Personaje p : arenaDeBatalla) {
                if (!p.estaVivo()) {
                    System.out.println("\n💀 ¡LA BATALLA HA TERMINADO! " + p.getNombre() + " ha quedado sin vida.");
                    continuarBatalla = false;
                    break;
                }
            }

            ronda++;

            // Pausa de seguridad para evitar bucles infinitos agresivos si los stats están mal configurados
            try { Thread.sleep(800); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }


    }
}

# 🎮 Proyecto Colaborativo: El Ecosistema RPG(Role-Playing Game) Virtual

¡Bienvenidos al ejercicio práctico de Programación Orientada a Objetos (POO) y Git/GitHub! En esta actividad simularemos un videojuego de rol donde cada uno de ustedes programará un héroe o criatura única utilizando **Herencia** y **Polimorfismo**.

## ⏱️ Cronograma de la Clase (1h 15min)
* **00:00 - 00:15 (15 min):** Explicación de la dinámica y realización del **Fork**.
* **00:15 - 00:45 (30 min):** Desarrollo de tu personaje en Java (**POO**).
* **00:45 - 01:05 (20 min):** Envío del **Pull Request (PR)** y correcciones.
* **01:05 - 01:15 (10 min):** Simulación de la batalla en vivo con todos los personajes.

---

## 🛠️ Instrucciones Paso a Paso para el Estudiante

### Paso 1: Configuración del Entorno (En la Nube y Local)
1. Inicia sesión en tu cuenta de GitHub.
2. Ve a la parte superior derecha de este repositorio y haz clic en el botón **"Fork"**. Esto creará una copia idéntica del proyecto en tu propia cuenta.
3. Clona **tu fork** a tu computadora local utilizando tu IDE favorito (IntelliJ, Eclipse, VS Code) o la terminal:
   ```bash
   git clone https://github.com...
   ```

### Paso 2: Desarrollo de tu Personaje (POO en Java)
Para evitar conflictos con tus compañeros, **no debes modificar la clase `Personaje.java`**. Sigue estas reglas estrictas:

1. Crea un **nuevo archivo** en la carpeta de código fuente cuyo nombre sea tu tipo de personaje seguido de tu nombre (Ejemplo: `MagoJairo.java` o `GuerreroAna.java`).
2. Tu clase **debe heredar (`extends`)** de la clase abstracta `Personaje`.
3. Implementa el constructor invocando a `super()` con el nombre, vida y fuerza de tu personaje.
4. Sobrescribe (`@Override`) el método abstracto `atacar(Personaje objetivo)`. Define ahí la lógica o el mensaje especial de tu ataque.

*Nota: Solo puedes modificar el archivo `Main.java` en la sección indicada con el comentario `// ESTUDIANTES: Añadan su instancia aquí` para probar tu personaje localmente.*

### Paso 3: Envío del Pull Request (PR)
Una vez que tu código funcione localmente y no tenga errores de compilación, súbelo a GitHub:
1. Guarda tus cambios locales:
   ```bash
   git add .
   git commit -m "Añadido personaje de [Tu Nombre]"
   git push origin main
   ```
2. Ve a la página de **tu fork** en GitHub web.
3. Verás un aviso que dice *"This branch is 1 commit ahead..."*. Haz clic en el botón **"Contribute"** y luego en **"Open Pull Request"**.
4. Ponle como título a tu PR: `[PR] Personaje de [Tu Nombre]` y envíalo. ¡El profesor revisará y aceptará tu criatura en vivo!

---

```

## 📝 Ejemplo de Referencia (Cómo debe quedar tu archivo)
Si tu nombre es Jairo y vas a crear un Mago, tu archivo `MagoJairo.java` debería lucir así:

```java
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
```


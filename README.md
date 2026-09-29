#  Kotlin Beginner Workshop

**Estudiante:** Elizabeth Taborda
**Curso:** APLICACIONES MOVILES
**Lenguaje:** Kotlin

---

## 📖 Descripción

Taller de introducción a Kotlin basado en la sección *Beginner* del Kotlin Tour de la documentación oficial. Contiene ocho ejercicios independientes que practican variables, condicionales, ciclos, colecciones, funciones, clases y manejo seguro de valores nulos.

---

## 📂 Estructura del repositorio

```
kotlin-beginner-workshop/
├── README.md
├── exercise-01/Main.kt
├── exercise-02/Main.kt
├── exercise-03/Main.kt
├── exercise-04/Main.kt
├── exercise-05/Main.kt
├── exercise-06/Main.kt
├── exercise-07/Main.kt
└── exercise-08/Main.kt
```

Cada ejercicio es un archivo independiente con su propia función `main()`, separado por `package` para que no haya conflictos.

---

## 📝 Ejercicios

| # | Carpeta | Tema | Conceptos |
|---|---------|------|-----------|
| 1 | `exercise-01` | Calculadora básica | `when`, valores nulos, división entre cero |
| 2 | `exercise-02` | Clasificación de estudiantes | Promedio, `if / else` |
| 3 | `exercise-03` | Tabla de multiplicar | Ciclo `for`, acumulador |
| 4 | `exercise-04` | Análisis de una lista | `listOf`, ciclos, contadores |
| 5 | `exercise-05` | Funciones matemáticas | `isPrime`, `factorial`, `isEven` |
| 6 | `exercise-06` | Gestión de productos | Clase `Product`, métodos |
| 7 | `exercise-07` | Agenda de contactos | Clase `Contact`, `mutableListOf` |
| 8 | `exercise-08` | Manejo de valores nulos | `String?`, null safety |

---

## ⚙️ Requisitos previos

- **IntelliJ IDEA** (Community o Ultimate), con soporte para Kotlin incluido.
- **JDK 17 o superior** (IntelliJ puede descargarlo por ti).
- **Git** instalado.

---

## ▶️ Cómo ejecutar los ejercicios (paso a paso)

### Paso 1. Clonar el repositorio

Clonar significa descargar una copia del proyecto a tu computador. Elige **una** de estas tres formas.

#### Opción A: desde GitHub (copiando el enlace)

1. Entra a https://github.com/elizabethtabordaDAM/kotlin-beginner-workshop.
2. Haz clic en el botón verde **`<> Code`**, arriba a la derecha de la lista de archivos.
3. En la pestaña **HTTPS**, haz clic en el icono de copiar 📋 para copiar el enlace:
   `https://github.com/elizabethtabordaDAM/kotlin-beginner-workshop.git`
4. Abre una terminal en la carpeta donde quieras guardar el proyecto y ejecuta:

```
git clone https://github.com/elizabethtabordaDAM/kotlin-beginner-workshop.git
```

5. Se crea una carpeta llamada `kotlin-beginner-workshop` con todos los ejercicios.

#### Opción B: desde IntelliJ IDEA (sin usar la terminal)

1. Abre IntelliJ IDEA. Si ya hay un proyecto abierto, ve a **File → Close Project** para volver a la pantalla de bienvenida.
2. Haz clic en **Clone Repository** (o en **Get from VCS**).
   - Si tienes un proyecto abierto, también puedes ir a **File → New → Project from Version Control**.
3. En **URL**, pega el enlace:
   `https://github.com/elizabethtabordaDAM/kotlin-beginner-workshop.git`
4. En **Directory**, elige la carpeta del computador donde se guardará.
5. Haz clic en el botón **Clone**.
6. Si pregunta *"Trust Project"*, elige **Trust Project**.

Con esta opción el proyecto ya queda abierto en IntelliJ, así que puedes saltar al **Paso 3**.

#### Opción C: descargar como ZIP (sin instalar Git)

1. Entra al repositorio en GitHub.
2. Haz clic en el botón verde **`<> Code`**.
3. Elige **Download ZIP**.
4. Descomprime el archivo en una carpeta de tu computador.
5. Continúa con el Paso 2 para abrir la carpeta en IntelliJ.

### Paso 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Ve a **File → Open**.
3. Selecciona la carpeta `kotlin-beginner-workshop` y pulsa **OK**.
4. Si pregunta *"Trust Project"*, elige **Trust Project**.
5. Espera a que termine de cargar (barra de progreso abajo a la derecha).

### Paso 3. Verificar el JDK

1. Presiona `Ctrl + Alt + Shift + S` (**Project Structure**).
2. En **Project → SDK**, debe haber un JDK seleccionado (17 o superior).
3. Si dice `<No SDK>`, despliega la lista y elige uno, o usa **Add SDK → Download JDK**.
4. Pulsa **Apply → OK**.

### Paso 4. Marcar la carpeta raíz como código fuente

Este paso permite que aparezca el botón de ejecutar:

1. `Ctrl + Alt + Shift + S` → **Modules**.
2. Pestaña **Sources**.
3. Selecciona la carpeta raíz del proyecto y pulsa el botón azul **Sources**.
4. Pulsa **Apply → OK**.

### Paso 5. Ejecutar un ejercicio

1. En el panel izquierdo (**Project**), abre la carpeta del ejercicio, por ejemplo `exercise-01`.
2. Haz doble clic en `Main.kt`.
3. Junto a la línea `fun main()` aparece un **triángulo verde ▶**.
4. Haz clic en el triángulo y elige **Run**.
    - Atajo: `Ctrl + Shift + F10` con el archivo abierto.
5. Abajo se abre la ventana **Run** con el resultado.
6. Si termina con `Process finished with exit code 0`, se ejecutó sin errores.

### Paso 6. Repetir con los demás ejercicios

Repite el Paso 5 abriendo el `Main.kt` de cada carpeta (`exercise-02` hasta `exercise-08`).

---

## 🛠️ Solución de problemas

| Problema | Solución |
|----------|----------|
| No aparece el triángulo verde | Repite el Paso 4 (marcar como Sources) |
| El botón de ejecutar está gris | Revisa el JDK en el Paso 3 |
| Error `Conflicting overloads` | Verifica que cada archivo tenga su `package` en la primera línea (`exercise01`, `exercise02`, ...) |
| Error `Unresolved reference` | Revisa que el nombre de la variable o función esté escrito igual donde se define y donde se usa |



## 🕒 Historial de commits

Cada ejercicio se construyó en **dos commits**: primero la versión básica y luego la mejora. Así se puede ver cómo evolucionó cada solución.

👉 [Ver todos los commits del repositorio](https://github.com/elizabethtabordaDAM/kotlin-beginner-workshop/commits/main)

### Ver los commits en GitHub

1. Entra a la página principal del repositorio.
2. Haz clic en el texto con el reloj y el número de commits, arriba a la derecha de la lista de archivos.
3. Se muestra la lista de commits, del más reciente al más antiguo.
4. Haz clic en el mensaje de un commit para ver qué cambió: en **rojo** lo que se quitó y en **verde** lo que se agregó.

### Ver los commits de un ejercicio

1. Abre la carpeta del ejercicio, por ejemplo `exercise-03`.
2. Haz clic en `Main.kt`.
3. Pulsa **History** (arriba a la derecha) para ver solo los commits de ese archivo.

### Ver los commits en la terminal

```
git log --oneline
```

Muestra una línea por commit con su mensaje. Se sale con la tecla `q`.

### Resumen de commits por ejercicio

| Ejercicio | Commit 1 | Commit 2 |
|-----------|----------|----------|
| 1 | Versión básica con `when` | Control de división entre cero |
| 2 | Promedio y aprobado/reprobado | Promedio excelente |
| 3 | Tabla de multiplicar | Suma de resultados |
| 4 | Lista, suma y promedio | Mayor, menor, pares e impares |
| 5 | Funciones `isPrime`, `factorial`, `isEven` | Varios números y negativos |
| 6 | Clase `Product` con un producto | Tres productos y total |
| 7 | Clase `Contact` y lista | Agregar, listar, buscar y eliminar |
| 8 | Saludo con `String?` | Texto vacío y varios valores |
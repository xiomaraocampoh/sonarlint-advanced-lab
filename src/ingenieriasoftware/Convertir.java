package ingenieriasoftware;

// Importamos las herramientas necesarias:
import java.util.Scanner; // Para leer lo que el usuario escribe
import java.util.logging.Level; // Para definir la importancia del mensaje (INFO, WARNING, etc.)
import java.util.logging.Logger; // La herramienta para crear los logs

public class Convertir {

    // 1. Configuramos el Logger.
    // Usamos 'getClass().getName()' para que el log sepa automáticamente que viene de la clase "Convertir".
    Logger logger = Logger.getLogger(getClass().getName());

    public int doConvertMeasure() {

        // 2. Preparamos el Scanner para leer desde la consola (System.in)
        Scanner sc = new Scanner(System.in);

        // 3. Mostramos un mensaje pidiendo datos.
        // Usamos .info() porque es un mensaje informativo normal.
        logger.info("Ingrese la medida en cm: ");

        // 4. El programa se detiene aquí esperando a que el usuario escriba un número entero y presione Enter.
        int medida = sc.nextInt();

        // 5. Realizamos la conversión (Centímetros a Metros).
        // NOTA: Al ser variables 'int' (enteras), esto borrará los decimales.
        int medidaResultante = medida / 100;

        // 6. Mostramos el resultado.
        // Aquí usamos logger.log con Level.INFO.
        // El "{0}" es un marcador de posición que se reemplaza por el valor de 'medidaResultante'.
        // Es la forma correcta de concatenar en java.util.logging.
        logger.log(Level.INFO, "Medida en metros: {0}", medidaResultante);

        // 7. Devolvemos el valor calculado a quien haya llamado a este método.
        return medidaResultante;
    }

    // Método principal: Aquí arranca la aplicación
    public static void main(String[] args) {

        // Creamos una instancia (objeto) de nuestra clase Convertir
        Convertir c = new Convertir();

        // Ejecutamos el método de conversión
        c.doConvertMeasure();

    }
}

package ingenieriasoftware;


import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showInputDialog;

public class Convertir {

    Logger logger = Logger.getLogger(getClass().getName());

    //creamos un método que recibe 2 enteros y retorne 1

    public int doConvertMeasure() {

       int medida = Integer.parseInt(showInputDialog("ingrese la medida en cm"));

        //Pedimos la medida original
        //y la guardamos en la variable medida
        //Realizamos la operación para convertir

       int medidaResultante = (medida/100);

        logger.log(Level.INFO, "Medida en m: {0}", medidaResultante);

        return medidaResultante;

    }

    public static void main(String[] args) {

        Convertir c = new Convertir();
        c.doConvertMeasure();

    }
}

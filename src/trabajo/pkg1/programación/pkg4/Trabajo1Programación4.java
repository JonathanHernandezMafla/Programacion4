package trabajo.pkg1.programación.pkg4;

import javax.swing.*;

public class Trabajo1Programación4 {

    public static void main(String[] args) {

        Datas valores = new Datas(7);

        float dato1 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite la longitud de la plancha:"));

        valores.indata(dato1, 0);

        float dato2 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el ancho de la plancha:"));

        valores.indata(dato2, 1);

        float dato3 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el ancho de la canal:"));

        valores.indata(dato3, 2);

        float dato4 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el ángulo de inclinación de la plancha:"));

        valores.indata(dato4, 3);

        float dato5 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el radio del cilindro:"));

        valores.indata(dato5, 4);

        float dato6 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite la altura del cilindro:"));

        valores.indata(dato6, 5);

        float dato7 = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el número de horas de lluvia:"));

        valores.indata(dato7, 6);

        String registro = ("\nLos datos digitados fueron los siguientes:\n\n"
                + "Largo plancha = " + valores.getdatapos(0) + "\n"
                + "Ancho plancha = " + valores.getdatapos(1) + "\n"
                + "Ancho canal = " + valores.getdatapos(2) + "\n"
                + "Ángulo de inclinación = " + valores.getdatapos(3) + "\n"
                + "Radio del cilindro = " + valores.getdatapos(4) + "\n"
                + "Altura del cilindro = " + valores.getdatapos(5) + "\n"
                + "Horas de lluvia = " + valores.getdatapos(6) + "\n");

        JOptionPane.showMessageDialog(null, registro);

       
        Rain calculo = new Rain();

        String resultado = ("El volumen total acumulado tras "
                + valores.getdatapos(6) + " horas "
                + "\nde lluvia es de " + calculo.vRain(valores) + " ml");

        JOptionPane.showMessageDialog(null, resultado);
    }

}

package Taller;

import javax.swing.*;

public class Ejecutable {

    public static Persona addDatosPartOne(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cuanto mide "));

        JOptionPane.showMessageDialog(null, "Datos ingresados satisfactoriamente!");
        return new Persona(nombre,edad,sexo,peso,altura);
    }

    public static Persona addDatosPartTwo() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo");
        JOptionPane.showMessageDialog(null, "Datos ingresados satisfactoriamente!");
        return new Persona(nombre, edad, sexo);
    }

    /*public double calcularIMC() {
        double imc;
        imc = peso / Math.pow(altura, 2);
        if (imc<20){
            return -1;
        }else if (imc>20&&imc<=25){
            return 0;
        }else{
            return 1;
        }
    }*/

    public void esMayorDeEdad(){

    }
}

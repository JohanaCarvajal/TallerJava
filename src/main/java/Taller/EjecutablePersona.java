package Taller;

import javax.swing.*;

public class EjecutablePersona {

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

    public double calcularIMC() {
        double peso =0, altura =0;
        int peso_ideal = -1;
        int debajo_ideal = 0;
        int sobrepeso = 1;

        double imc;
        imc = peso / Math.pow(altura, 2);
        if (imc<20){
            System.out.println("El resultado es "+peso_ideal+"Sginifica que tiene un peso ideal");
        }else if (imc>20&&imc<=25){
            System.out.println("El resultado es "+debajo_ideal+"Sginifica que está por debajo de su peso ideal");
        }else{
            System.out.println("El resultado es "+sobrepeso+"Sginifica que tienes sobepeso");
        }
        return imc;
    }

    public boolean esMayorDeEdad(){
        int edad = 0;
        boolean esMayor = false;
            if(edad>=18){
                esMayor= true;
            }
        return esMayor;
    }

    public void validarSexo(char sexo){
        if(sexo != sexo) {
            sexo = 'H';
        }
    }

    public void imprimir (){
        System.out.println(toString());
    }

}

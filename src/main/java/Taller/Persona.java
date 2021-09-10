package Taller;

public class Persona<sexo> {

    private String nombre,DNI;
    private int edad;
    private String sexo ;
    private double peso =0, altura =0;

    public Persona (){
        this.nombre = "";
        this.DNI = DNI;
        this.edad = 0;
        this.sexo =  "H";
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = "";
        this.DNI = DNI;
        this.edad = 0;
        this.sexo =  "H";
        this.peso = 0;
        this.altura = 0;

    }
    public Persona(String nombre,  int edad, String sexo,double peso, double altura){

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}

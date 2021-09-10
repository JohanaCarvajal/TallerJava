package Taller;

public class Videojuego implements Entregable {
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean itsEntregado = false;
    private String genero = "";
    private String compañia = "";

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego() {
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", itsEntregado=" + itsEntregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }



    @Override
    public void entregar() {
        itsEntregado = true;

    }

    @Override
    public void devolver() {
        itsEntregado = false;
    }

    @Override
    public boolean isEntregado() {
        boolean result = itsEntregado;
        return result;
    }

    @Override
    public boolean isEntregado(boolean prestado) {
        return false;
    }

    @Override
    public int compareTo(Videojuego obj) {
        return 0;
    }

}

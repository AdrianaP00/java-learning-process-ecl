package appapuestas;

public class Apuesta {
    private String apostador;
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private double cantidadApuesta;
    private boolean isGanada; 

    public Apuesta(String apostador, String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante, double cantidadApuesta, boolean isGanada) {
        this.apostador = apostador;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.cantidadApuesta = cantidadApuesta;
        this.isGanada = isGanada;
    }

    public String getApostador() {
        return apostador;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public double getCantidadApuesta() {
        return cantidadApuesta;
    }

    public boolean isGanada() {
        return isGanada;
    }

    @Override
    public String toString() {
        return "Apostador: " + apostador +
                ", Equipo Local: " + equipoLocal +
                ", Equipo Visitante: " + equipoVisitante +
                ", Goles Local: " + golesLocal +
                ", Goles Visitante: " + golesVisitante +
                ", Cantidad Apuesta: " + cantidadApuesta +
                ", Ganada: " + (isGanada ? "Sí" : "No");
    }
    
}

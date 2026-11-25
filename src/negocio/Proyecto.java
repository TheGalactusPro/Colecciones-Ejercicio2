package negocio;
import java.util.ArrayList;
public class Proyecto {
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;
    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }
    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }
    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }
        return null;
    }
    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador encontrado = buscarDesarrollador(identificacion);
        if (encontrado != null) {
            desarrolladores.remove(encontrado);
            return true;
        }
        return false;
    }
    public double calcularTotalHoras() {
        double total = 0;
        for (Desarrollador d : desarrolladores) {
            total += d.getHorasAsignadas();
        }
        return total;
    }
    public String mostrarEquipo() {
        String resultado = "PROYECTO: " + nombre + "\n";
        for (Desarrollador d : desarrolladores) {
            resultado += d.mostrarInformacion() + "\n";
            resultado += "--------------------------\n";
        }
        resultado += "Total de desarrolladores: " + desarrolladores.size();
        resultado += "\nTotal de horas: " + calcularTotalHoras();
        return resultado;
    }
}
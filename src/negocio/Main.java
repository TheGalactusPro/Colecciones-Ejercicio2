package negocio;
public class Main {
    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("D01", "Ana", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D02", "Luis", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D03", "Carlos", "Base de datos", 25);
        Proyecto proyecto = new Proyecto("Sistema de ventas");
        System.out.println("PROYECTO VACIO");
        System.out.println(proyecto.mostrarEquipo());
        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);
        System.out.println("\nEQUIPO DEL PROYECTO");
        System.out.println(proyecto.mostrarEquipo());
        System.out.println("\nBUSCAR DESARROLLADOR D02");
        Desarrollador encontrado = proyecto.buscarDesarrollador("D02");
        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Desarrollador no encontrado");
        }
        System.out.println("\nBUSCAR DESARROLLADOR D10");
        Desarrollador noEncontrado = proyecto.buscarDesarrollador("D10");
        if (noEncontrado != null) {
            System.out.println(noEncontrado.mostrarInformacion());
        } else {
            System.out.println("Desarrollador no encontrado");
        }
        System.out.println("\nTOTAL DE HORAS: " + proyecto.calcularTotalHoras());
        System.out.println("\nELIMINAR DESARROLLADOR D02");
        boolean eliminado = proyecto.eliminarDesarrollador("D02");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("\nELIMINAR DESARROLLADOR D10");
        boolean eliminado2 = proyecto.eliminarDesarrollador("D10");
        System.out.println("Eliminado: " + eliminado2);
        System.out.println("\nEQUIPO ACTUALIZADO");
        System.out.println(proyecto.mostrarEquipo());
    }
}
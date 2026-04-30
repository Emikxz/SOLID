package A4_Interface_Segregation_Principle;
// Esta clase representa a un desarrollador backend.
// Un backend developer solo implementa la interfaz Programador porque su responsabilidad es programar.
// No implementa las otras interfaces porque no corresponde obligarlo a hacer tareas que no son suyas.
public class BackendDeveloper implements Programador {

    // Implementamos el método programar porque esta clase tiene que cumplir con esa tarea de Programador.
    @Override
    public void programar() {
        System.out.println("El desarrollador backend está programando la lógica del sistema...");
    }
}

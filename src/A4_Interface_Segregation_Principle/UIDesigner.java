package A4_Interface_Segregation_Principle;

// Esta clase representa a un diseñador de interfaces.
// Solo implementa la interfaz Diseñador porque su responsabilidad es encargarse del diseño.
// No implementa las demás porque no tiene sentido obligarlo a programar backend o administrar servidores porque
// no es su tarea.
public class UIDesigner implements Diseñador {

    // Implementamos el método diseñar porque esta clase sí se encarga del diseño de la interfaz.
    @Override
    public void diseñar() {
        System.out.println("El diseñador está trabajando diseñando la interfaz del usuario...");
    }
}

package A4_Interface_Segregation_Principle;

// Esta clase representa a una persona encargada de infraestructura.
// Solo implementa DevOps porque su tarea es gestionar servidores y es la única tarea que realmente debe cumplir.
public class ServerAdmin implements DevOps {

    // Implementamos el método gestionarServidor porque esta clase sí trabaja con servidores e infraestructura.
    @Override
    public void gestionarServidor() {
        System.out.println("El administrador de servidores está configurando la infraestructura...");
    }
}

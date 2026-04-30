package A4_Interface_Segregation_Principle;

// Esta interfaz representa la capacidad de gestionar servidores.
// Solo la implementarán las clases que trabajen con infraestructura.
interface DevOps {

    // Método que representa la tarea de administrar servidores.
    void gestionarServidor();
}
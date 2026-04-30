package A4_Interface_Segregation_Principle;

// Esta interfaz representa la capacidad de dar soporte al cliente.
// Solo la implementarán las clases que hagan soporte.
interface SoporteTecnico {

    // Método que representa la tarea de brindar soporte.
    void darSoporte();
}
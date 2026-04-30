package A4_Interface_Segregation_Principle;

// Esta clase representa a una persona de soporte técnico.
// Solo implementa SoporteTecnico porque su responsabilidad es atender problemas de clientes y no las demás.
public class CustomerSupport implements SoporteTecnico {

    // Implementamos el método darSoporte porque esta clase sí se dedica al soporte.
    @Override
    public void darSoporte() {
        System.out.println("El soporte técnico está ayudando al cliente...");
    }
}

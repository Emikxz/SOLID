package A5_Dependency_Inversion_Principle;

// Creamos una clase llamada EmailSender que representa el envío de notificaciones por email.
// Es una implementación concreta porque su responsabilidad es enviar notificaciones por email,
// implementa NotificationSender porque sabe enviar mensajes.
public class EmailSender implements NotificationSender {

    // sobreescribimos el método send de la interfaz NotificationSender.
    @Override
    public void send(String msg) {
        // simulamos que enviamos un email.
        System.out.println("Enviando email: " + msg );
    }
}

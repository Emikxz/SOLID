package A5_Dependency_Inversion_Principle;

// Creamos una clase llamada SmsSender que representa el envío de notificaciones por SMS.
// SmsSender también implementa NotificationSender, pero en vez de enviar por email, lo hace por SMS.
public class SmsSender implements NotificationSender {

    // Sobrescribimos el método send de la interfaz NotificationSender.
    @Override
    public void send(String msg) {
        // simulamos el envío de un sms.
        System.out.println("Enviando sms: " + msg);
    }
}

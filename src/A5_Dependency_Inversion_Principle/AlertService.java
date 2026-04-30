package A5_Dependency_Inversion_Principle;

// Creamos una clase AlertService que representa un servicio encargado de enviar alertas importantes.
// Esta clase se encarga de enviar alertas, pero no sabe dónde enviar esas alertas.
// No sabe si el mensaje va para EmailSender o SmsSender, solo sabe que tiene un objeto capaz de enviar notificaciones.
// Esto cumple con el principio porque AlertService depende de una abstracción, no de una clase concreta.
public class AlertService {

    // Atributo que guarda el objeto encargado de enviar la notificación.
    // Importante: Usamos la interfaz NotificationSender, no una clase concreta.
    private NotificationSender notificationSender;

    // Constructor de la clase que recibe por parámetro a cualquier objeto que implemente NotificationSender.
    public AlertService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    // Método que envía una alerta.
    public void sendAlert(String msg) {
        String alertMsg = "ALERTA: " + msg;

        // Enviamos el mensaje usando la interfaz NotificationSender.
        // AlertService no sabe si se enviará por email, SMS u otro medio.
        notificationSender.send(alertMsg);
    }

}

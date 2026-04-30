package A5_Dependency_Inversion_Principle;

// Creamos una interfaz llamada NotificationSender que representa cualquier forma de enviar una notificación.
// Cualquier clase que implemente esta interfaz debe saber enviar un mensaje.
public interface NotificationSender {

    // Método que deberán implementar todas las clases que envíen notificaciones.
    // Recibe un mensaje de texto y lo envía por algún medio.
    void send(String msg);
}

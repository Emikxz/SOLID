package A5_Dependency_Inversion_Principle;

/*
* DEPENDENCY INVERSION PRINCIPLE - PRINCIPIO DE INVERSIÓN DE DEPENDENCIAS.
* El principio dice que las clases importantes del sistema no deberían depender directamente de clases concretas,
* sino de abstracciones.
* Una clase no debería estar atada a una implementación específica.
* En JAVA, una abstracción suele ser una interface o una clase abstracta.
*
* Idea:
* Imaginamos que tenemos un sistema que envía alertas.
* Al principio, queremos enviar alertas por email. EmailSender.
* Pero después queremos enviar alertasp or SMS. SmsSender.
* y después queremos enviar por WhatsApp. WhatsAppSender.
* El problema acá va a ser que nuestra clase principal, por ejemplo, AlertService, depende directamente de EmailSender.
* Porque si mañana queremos cambiar el medio de notificación, tenemos que modificar AlertService.
* Eso es lo que este principio quiere evitar.
*
* ¿Qué propone este principio?
* En vez de que AlertService dependa directamente de EmailSender, hacemos una interfaz NotificationSender y después
* las clases concretas implementan esa interfaz.
*   EmailSender implements NotificationSender
*   SmsSender implements NotificationSender
* entonces AlertService no depende de una clase concreta, sino de una idea general (algo que sabe enviar notificaciones).
*
* ¿Qué hace este ejemplo de Java?
* El programa crea dos formas de enviar notificaciones. EmailSender y SmsSender.
* Después crea dos servicios de alerta (AlertService emailAlertService y AlertService smsAlertService).
* Uno usa email y el otro SMS.
*
* ¿Por qué este ejemplo cumple con el principio?
* Este ejemplo cumple con el principio de dependencias porque AlertService no depende directamente de EmailSender ni de
* SmsSender. Depende de la interfaz NotificationSender.
* Eso permite cambiar el medio de envío sin modificar AlertService.
*
* Por ejemplo, si mañana queremos agregar WhatsApp, hacemos esto:
*
        // Nueva clase para enviar notificaciones por WhatsApp.
        class WhatsAppSender implements NotificationSender {

            @Override
            public void send(String message) {
                System.out.println("Enviando WhatsApp: " + message);
            }
        }
y en el main
        NotificationSender whatsAppSender = new WhatsAppSender();

        AlertService whatsAppAlertService = new AlertService(whatsAppSender);

        whatsAppAlertService.sendImportantAlert("Nueva alerta por WhatsApp.");

* No tocamos AlertService, que es lo importante.
*
* */
public class Main {

    public static void main(String[] args) {

        // Creamos un objeto EmailSender que sabe enviar notificaciones por email.
        NotificationSender emailSender = new EmailSender();

        // Creamos un AlertService que usará emailSender.
        // AlertService no recibe una clase concreta directamente,
        // sino que recibe algo que cumple con la interfaz NotificationSender.
        AlertService emailAlertService = new AlertService(emailSender);

        // Enviamos una alerta por email.
        emailAlertService.sendAlert("El sistema detectó un error!");

        // Creamos un objeto SmsSender que sabe enviar notificaciones por SMS.
        NotificationSender smsSender = new SmsSender();

        // Creamos otro AlertService, pero esta vez usando SMS.
        // Como vemos, no tuvimos que modificar la clase AlertService.
        AlertService smsAlertService = new AlertService(smsSender);

        // Enviamos una alerta por SMS.
        smsAlertService.sendAlert("El servidor no responde!");
    }
}

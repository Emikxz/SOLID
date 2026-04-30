package A4_Interface_Segregation_Principle;

/*
* INTERFACE SEGREGATION PRINCIPLE - PRINCIPIO DE SEGREGACIÓN DE INTERFACES
* El principio dice que no se debe obligar a una clase a implementar métodos que no necesita.
* Es mejor tener varias interfaces pequeñas y específicas, en lugar de una interfaz gigante con métodos que algunas
* clases no van a usar.
*
* Supongamos lo siguiente, nos hacen firmar un contrato que dice que debemos
*       * Programar
*       * Diseñar interfaces
*       * Administrar servidores
*       * Dar soporte al cliente
* Pero nosotros solo somos backend.
* Entonces, ¿por qué debería de aceptar responsabilidades que no me corresponden?
* Esto mismo es lo que pasa en programación cuando hacemos una interfaz enorme como esta:
*       interface Trabajador {
*           void programar();
*           void diseñar();
*           void gestionarServidor();
*           void darSoporte();
*       }
* El problema es que después una clase como BackendDeveloper estaría obligada a implementar también diseñar(),
* gestionarServidor() y darSoporte() aunque no sean tareas suyas. Eso viola el principio.
*
* Este principio lo que propone es en vez de hacer una interfaz grande, hacemos varias interfaces chicas y específicas.
* Por ejemplo:
*       - Programador
*       - Diseñador
*       - DevOps
*       - SoporteTécnico
* entonces cada clase implementaría solo la interfaz que realmente necesita.
*
* Ejemplo en JAVA
* ¿Qué hace este ejemplo?
* Este programa crea cuatro objetos, cada uno con una tarea distinta.
*   - Un backend developer.
*   - Un diseñador.
*   - Un administrador de servidores.
*   - Un soporte técnico.
* y a cada uno se le pide solo la tarea que le corresponde, lo que obliga al programa a cumplir con este principio
* de Segregación de Interfaces porque cada clase implementa solo la interfaz que necesita.
*
* ¿Cómo no cumpliría con este principio?
* Si la interfaz fuera demasiado grande como pusimos más arriba porque estaríamos obligando a una clase a desarrollar
* funciones que no sabe hacer.
* Por ejemplo
*
*   // Esta clase NO cumple bien con el principio.
    // Se ve obligada a implementar métodos que no necesita.
    class BackendDeveloper implements Trabajador {

        // Este método sí tiene sentido porque un backend developer programa.
        @Override
        public void programar() {
            System.out.println("El desarrollador backend está programando.");
        }

        // Este método no tiene sentido para un backend developer.
        @Override
        public void diseñar() {
            System.out.println("No me corresponde diseñar.");
        }

        // Este método tampoco tiene sentido para un backend developer.
        @Override
        public void gestionarServidor() {
            System.out.println("No me corresponde administrar servidores.");
        }

        // Este método tampoco tiene sentido para un backend developer.
        @Override
        public void darSoporte() {
            System.out.println("No me corresponde dar soporte.");
        }
    }
*/

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto de tipo BackendDeveloper que representa a un desarrollador backend.
        BackendDeveloper backend = new BackendDeveloper();

        // Creamos un objeto de tipo UIDesigner que representa a una persona que diseña interfaces.
        UIDesigner designer = new UIDesigner();

        // Creamos un objeto de tipo ServerAdmin que representa a quién administra servidores.
        ServerAdmin admin = new ServerAdmin();

        // Creamos un objeto de tipo CustomerSupport que representa a una persona de soporte técnico.
        CustomerSupport support = new CustomerSupport();

        // Le pedimos a cada uno de los objetos que creamos recién que cumplan con su tarea.
        backend.programar();

        designer.diseñar();

        admin.gestionarServidor();

        support.darSoporte();

    }
}

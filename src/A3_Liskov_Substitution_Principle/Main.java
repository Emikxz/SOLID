package A3_Liskov_Substitution_Principle;

/*
* LISKOV SUBSTITUTION PRINCIPLE - PRINCIPIO DE SUSTITUCIÓN DE LISKOV
* El principio dice que si una clase hija hereda de una clase padre, deberíamos poder usar la clase hija en cualquier
* lugar donde se espera a la clase padre, sin que el programa se rompa.
* Dicho de manera más fácil, una subclase debe poder reemplzar a su superclase sin causar problemas.
*
* Supongamos que tenemos una clase padre llamada Document.
* Y tenemos dos clases hijas llamadas EditableDocument y ReadOnlyDocument.
* Si ambas heredan de Document, entonces deberían poder usarse como un Document, sin generar errores inesperados.
* El problema aparece cuando una clase hija hereda métodos que no puede cumplir correctamente.
* Por ejemplo, si Document tiene un método save() pero después hacemos una clase ReadOnlyDocument que hereda de Document,
* pero no puede guardar porque es solo de lectura.
* Entonces cuando alguien intenta hacer document.save(); el programa podría romperse, lo que viola el principio.
*
* Un ejemplo que sí cumple con dicho principio es hacer una jerarquía correcta, donde:
*  - Document es la clase base.
*  - EditabelDocument será una clase hija que agrega la posibilidad de editar y guardar.
*  - ReadOnlyDocument será otra clase hija que solo puede leerse.
* La clave está en que no ponemos save() en Document, porque no todos los documentos pueden guardarse.
*
*
 */

// Ejemplo en JAVA

/*
 * El programa crea dos tipos de documentos, el de solo lectura y el editable.
 * Después usa un método para mostrarlos. Ese método debe recibir un objeto tipo Document, pero le podemos pasar tanto
 * como ReadOnlyDocument como EditableDocument porque ambas clases son hijas de Document.
 *
 * ¿Por qué este ejemplo cumple con el principio?
 * Porque cualquier clase hija de Document puede usarse donde se espera un Document.
 * showDocument por ejemplo espera un Document y funciona correctamente con ReadOnlyDocument y EditableDocument.
 * Esto significa que las clases hijas pueden sustituir a la clase padre sin romperse.
 *
 * El punto clave está en que Document solo tiene métodos que todos los documentos pueden cumplir:
 *  - getTitle
 *  - getContent
 * tanto un documento editable, como uno de solo lectura pueden tener título y contenido, por eso está bien.
 * En cambio, no pusimos save() en Document porque no todos los documentos pueden guardarse.
 *
 * ¿Cómo NO cumpliría con el principio?
 * Si la clase padre tuviera el método save().
 * El problema es que después ReadOnlyMethod hereda ese método, pero en realidad no puede guardar porque le definimos
 * que lance un error cuando se intente guardar.
 *
 * Supongamos que después agregamos un método void saveDocument(Document document) { document.save("Nuevo contenido") }
 * cuando le pasemos ReadOnlyDocument va a lanzar error porque no la clase hija no puede reemplazar correctamente a
 * Document, lo que viola el principio de Sustitución de Liskov.
 */
// Clase principal del programa para probarlo.
public class Main {

    // Método que muestra un documento por pantalla
    // Recibe un objeto de tipo Document.
    public static void showDocument(Document document) {
        System.out.println("Título: " + document.getTitle());
        System.out.println("Contenido: " + document.getContent());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public static void main(String[] args) {

        // Creamos un documento de solo lectura.
        // Aunque el tipo de la variable es Document, el objeto real es ReadOnlyDocument
        Document readOnlyDocument = new ReadOnlyDocument("Reglas", "Este documento no se puede modificar");

        // Creamos un documento editable.
        // Aunque el tipo de la variable es Document, el objeto real es EditableDocument
        Document editableDocument = new EditableDocument("Apuntes", "Contenido inicial");

        // Mostramos el documento de solo lectura.
        // Esto funciona porque el ReadOnlyDocument puede usarse como Document.
        showDocument(readOnlyDocument);

        // Mostramos el documento editable.
        // Esto funciona porque el EditableDocument puede usarse como document.
        showDocument(editableDocument);

        // Creamos otro documento editable.
        // En este caso usamos directamente el tipo EditableDocument.
        EditableDocument editableDocument1 = new EditableDocument("T.P. 1", "Primera versión");

        // Mostramos el documento antes de modificarlo.
        showDocument(editableDocument1);

        // Guardamos nuevo contenido en el documento editable.
        editableDocument1.save("Segunda versión");

        // Mostramos el documento después de modificarlo.
        showDocument(editableDocument1);

    }
}

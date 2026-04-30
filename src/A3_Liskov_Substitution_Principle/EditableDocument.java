package A3_Liskov_Substitution_Principle;

// Esta clase hereda de Document
// Esta clase si puede guardar cambios por lo que va a tener un método save().
public class EditableDocument extends Document {

    // Constructor de EditableDocument.
    public EditableDocument (String title, String content) {

        // llamamos al constructor de la clase padre Document y le pasamos el título y contenidos recibidos.
        super(title, content);
    }

    // Método para guardar el contenido del documento.
    public void save(String newContent) {
        // Actualizamos el valor de content con el nuevo valor pasado por parámetro.
        this.content = newContent;

        System.out.println("Documento guardado con éxito!");
    }
}

package A3_Liskov_Substitution_Principle;

public class ReadOnlyDocument extends Document{

    // Constructor
    public ReadOnlyDocument (String title, String content) {

        // Constructor de la clase padre Document, le pasamos el título y el contenido.
        super(title, content);
    }

    // Como no hace nada más, esta clase queda así, ya que solo se puede leer.
}

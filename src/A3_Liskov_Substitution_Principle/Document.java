package A3_Liskov_Substitution_Principle;


// Creamos la clase Document que representa un documento general y es la clase padre.
// no tiene un método save(), porque no todos los documentos deberían poder guardarse.
public class Document {

    // Atributo privado para guardar el título del documento.
    private String title;

    // Atributo protegido que guarda el contenido del documento.
    // Usamos protected para que las clases hijas puedan acceder a este atributo.
    protected String content;

    // Constructor.
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters del título y del contenido del documento.

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

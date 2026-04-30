package A1_Single_Responsability_Principle;

// Clase que representa al estudiante cuya única responsabilidad es guardar los datos del estudiante.
// Esta clase solo guarda información del estudiante. No imprime, no calcula si aprobó y no genera reportes.
// Por eso es que cumple con el principio de responsabilidad única.

public class Student {
    private String name; // Atributo para guardar nombre.
    private double score; // Atributo para guardar nota.

    // Constructor de la clase para crear un estudiante.
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

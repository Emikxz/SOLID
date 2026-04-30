package A1_Single_Responsability_Principle;

// Clase encargada de analizar la nota del estudiante. Su única responsabilidad es decidir si el estudiante aprobó o no.
public class StudentStatusService {

    // Método que recibe un estudiante y devuelve true o false dependiendo si aprobó o no.
    public boolean hasPassed(Student student) {
        // Obtenemos la nota del estudiante con el getter y luego comparamos si esa nota es mayor o igual a 6.
        // En este ejemplo, el estudiante aprueba con 6 o más.
        return student.getScore() >= 6;
    }
}

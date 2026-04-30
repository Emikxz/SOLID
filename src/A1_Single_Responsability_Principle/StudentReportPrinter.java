package A1_Single_Responsability_Principle;

// Clase encargada de imprimir información del estudiante. Sú única responsabilidad es mostrar el reporte por pantalla.
public class StudentReportPrinter {
    // Atributo que guarda un objeto de tipo StudentStatusService, el cual necesitamos para saber si el estudiante aprobó.
    private StudentStatusService statusService;

    // Constructor de la clase que recibe como parámetro un objeto StudentStatusService.
    public StudentReportPrinter(StudentStatusService statusService) {
        this.statusService = statusService;
    }

    // Método para imrpimir el reporte del estudiante.
    public void printReport(Student student) {
        System.out.println("Reporte del estudiante: ");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Nota: " + student.getScore());

        // Pregunta al servicio statusService si aprobó.
        if (statusService.hasPassed(student)) {
            System.out.println("Estado: Aprobado!");
        } else {
            System.out.println("Estado: Desaprobado!");
        }
    }
}

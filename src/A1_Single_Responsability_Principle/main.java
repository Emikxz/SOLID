package A1_Single_Responsability_Principle;

// SINGLE RESPONSIBILITY PRINCIPLE
/*
 Principio de responsabilidad única
 Dice que una clase debe tener una sola responsabilidad principal.

 De forma más simple: una clase debería tener una sola razón para cambiar. Por ejemplo, si una clase maneja datos
 de un alumno, calcula si aprobó, y además imprime reportes, tiene demasiadas responsabilidades.

 Este principio ayuda a que el código sea más fácil de modificar, porque si cambia la forma de imprimir un reporte, no
 se debería de tocar la clase que representa al alumno.

 En este ejemplo en Java separamos las responsabilidades:
 class Student: Representa al estudiante.
 class StudentStatusService: decide si aprobó.
 class StudentReportPrinter: imprime el reporte.
 main: prueba el funcionamiento del programa.

 Este ejemplo demuestra que Student no calcula ni imprime. Solo representa al estudiante. Si mañana cambia la forma de
 imprimir el reporte, modificamos StudentReportPrinter, no Student.

 Este ejemplo cumple con el principio porque si mas adelante queremos modificar por ejemplo la condición para aprobar,
 solo debemos ir a la clase StudentStatusService y cambiar la condición de 6 a 7 por ejemplo.
 O si cambia la forma de imprimir el reporte, modificamos la clase StatusReportPrinter.
 O si agregamos más datos al estudiante modificamos la clase Student.

 No cumpliría el principio de responsabilidad única si la clase tuviera que guardar datos, calcular, imprimir.
 */


// Clase principal para probar el ejemplo en el main.
public class main {
    public static void main(String[] args) {

        // Creamos a un objeto estudiante cuyo nombre es Emi y cuya nota es 8.
        Student student = new Student("Emi", 8);

        // Creamos el objeto statusService para saber si el estudiante aprobó o no.
        // Significaría crear un servicio que se encargue de evaluar el estado del estudiante.
        StudentStatusService statusService = new StudentStatusService();
        // Acá se crea un objeto de la clase StudentReportPrinter que se encarga de imprimir el reporte del estudiante.
        // Creamos un nuevo objeto StudentReportPrinter y le pasamos como parámetro el objeto statusService.
        // Le pasamos statusService como parámetro porque la clase necesita saber si el estudiante aprobó o no para poder
        // mostrarlo en el reporte.
        StudentReportPrinter printer = new StudentReportPrinter(statusService);

        // Llamamos al método printReport y le pasámos como parámetro el estudiante del cuál queremos imprimir datos.
        printer.printReport(student);

    }
}

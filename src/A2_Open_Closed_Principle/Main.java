package A2_Open_Closed_Principle;

/*
OPEN CLOSED PRINCIPLE
Principio Abierto/Cerrado

 Una clase debe estar abierta para extender pero cerrada para modificarse.

 Esto significa que, si necesitamos agregar una nueva funcionalidad, lo idea es no tener que modificar una clase que ya
 funciona. En vez de eso, agregamos nuevas clases que extiendan el comportamiento.

 Una clase está abierta a la extensión cuando puedo agregarle nuevo comportamiento usando otras clases, interfaces,
 herencia o polimorfismo.
 Por ejemplo, si tengo los metodos:
    -   StandardShipping
    -   ExpressShipping
    -   FreeShipping
 Puedo agregar otro nuevo:
    -   InternationalShipping
 Sin modificar la clase principal que en este ejemplo que voy a hacer es Order.

 Una clase está cerrada a la modificación cuando no necesito entrar a su código interno cada vez que aparece una nueva variante.
 Por ejemplo, la clase Order no debería tener muchos if preguntando:
    if (shippingType.equals("standard"))
    if (shippingType.equals("express"))
    if (shippingType.equals("free"))
 Porque si aparece otro tipo de envío, tendría que modificar la clase Order.

 Este principio evita que rompamos código existente cada vez que agregamos algo nuevo.

 Ejemplo en Java:
  supongamos que tenemos un sistema de pedidos con distintos tipos de envíos.

  En vez de poner muchos if dentro de Order, usamos una interfaz ShippingMethod.

  Este ejemplo demuestra que si mañana aparece un nuevo envío, por ejemplo InternationalShipping, no modificamos Order.
  Solo creamos una nueva clase que implemente ShippingMethod.
 */



// Clase principal para probar el ejemplo.
public class Main {
    public static void main(String[] args) {

        // Creamos diferentes pedidos usando distintos envíos.
        Order order1 = new Order(10000, new StandardShipping());
        Order order2 = new Order(10000, new ExpressShipping());
        Order order3 = new Order(10000, new FreeShipping());

        // Muestro por pantalla el total final de los pedidos.
        System.out.println("Pedido con envío estándar: $" + order1.calculateFinalTotal());
        System.out.println("Pedido con envío express: $" + order2.calculateFinalTotal());
        System.out.println("Pedido con envío gratis: $" + order3.calculateFinalTotal());
    }
}

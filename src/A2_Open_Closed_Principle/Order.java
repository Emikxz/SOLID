package A2_Open_Closed_Principle;

// Clase que representa un pedido.
public class Order {

    // Atributo que guarda el total del pedido sin contar el envío.
    private double total;

    // Atributo que guarda el método de envío.
    // No usamos una clase concreta como StandardShipping.
    // Usamos la interfaz ShippingMethod.
    private ShippingMethod shippingMethod;

    // Constructor de la clase Order.
    // Recibe el total del pedido y el método de envío que se va a usar.
    public Order(double total, ShippingMethod shippingMethod) {
        this.total = total;
        this.shippingMethod = shippingMethod;
    }

    // Método que calcula el total final del pedido.
    public double calculateFinalTotal() {
        // El pedido no sabe qué tipo exacto de envío usa.
        // Solo sabe que tiene un objeto que cumple con la interfaz ShippingMethod.
        return total + shippingMethod.calculateShippingCost(total);
    }
}



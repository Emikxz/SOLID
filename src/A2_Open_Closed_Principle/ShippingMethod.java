package A2_Open_Closed_Principle;

// Interfaz que define el comportamiento común de cualquier método de envío.
// Esta interfaz significa que cualquier método de envío que creemos, debe saber calcular su propio costo.
public interface ShippingMethod {

    // Método que deberán implementar todas las clases de envío.
    // Recibe el total del pedido y devuelve el costo del envío.
    double calculateShippingCost(double orderTotal);
}


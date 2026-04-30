package A2_Open_Closed_Principle;

// Método de envío gratis. Implementa ShippingMethod.
class FreeShipping implements ShippingMethod {

    // Sobrescribimos el método definido en la interfaz.
    @Override
    public double calculateShippingCost(double orderTotal) {
        // El envío gratis no suma costo al pedido.
        return 0;
    }
}
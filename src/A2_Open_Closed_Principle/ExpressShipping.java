package A2_Open_Closed_Principle;

// Método de envío express. Implementa la interfaz ShippingMethod.
public class ExpressShipping implements ShippingMethod{

    // Sobrescribimos el método definido en la interfaz.
    @Override
    public double calculateShippingCost(double orderTotal) {
        // El envío express cuesta más porque llega más rápido.
        return 2500;
    }
}

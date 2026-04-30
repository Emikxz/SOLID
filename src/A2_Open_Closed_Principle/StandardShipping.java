package A2_Open_Closed_Principle;

// Método de envío estándar.
// Implementa la interfaz ShippingMethod.
 class StandardShipping implements ShippingMethod {

    // Sobrescribimos el método definido en la interfaz.
     @Override
     public double calculateShippingCost(double orderTotal) {
         // El envío estandar tiene un coste fijo.
         return 1000;
     }
}

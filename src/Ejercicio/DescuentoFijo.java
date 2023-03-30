package Ejercicio;

public class DescuentoFijo extends Descuento{

    @Override
    public double CalcularvalorFinal(double montoSinDes) {
        return montoSinDes - this.getMontoDesc();
    }
}

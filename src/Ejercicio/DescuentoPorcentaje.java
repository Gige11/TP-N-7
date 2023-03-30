package Ejercicio;

public class DescuentoPorcentaje extends Descuento{

    @Override
    public double CalcularvalorFinal(double montoSinDes) {
        return montoSinDes-(montoSinDes * this.getMontoDesc());
    }
}

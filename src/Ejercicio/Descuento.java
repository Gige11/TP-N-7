package Ejercicio;

public abstract class Descuento {

    private double montoSinDes;
    private double montoFijoDesc;

    public double getMontoDesc() {
        return montoSinDes;
    }

    public void setMontoDesc(double montoSinDes) {
        this.montoSinDes = montoSinDes;
    }

    public abstract double CalcularvalorFinal(double montoSinDes);

}

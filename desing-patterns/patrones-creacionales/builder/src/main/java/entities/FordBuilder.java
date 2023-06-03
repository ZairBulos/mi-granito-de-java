package entities;

/**
 * ConcreteBuilder
 */
public class FordBuilder extends AutoBuilder {

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(4);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Ford");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Focus");
    }

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(21212);
        motor.setPotencia("20 HP");

        auto.setMotor(motor);
    }
}

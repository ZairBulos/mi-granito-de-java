package entities;

/**
 * Builder
 */
public abstract class AutoBuilder {

    protected Auto auto;

    public Auto getAuto() {
        return auto;
    }

    public void crearAuto() {
        this.auto = new Auto();
    }

    public abstract void buildPuertas();

    public abstract void buildModelo();

    public abstract void buildMarca();

    public abstract void buildMotor();
}

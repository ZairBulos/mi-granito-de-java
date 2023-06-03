package entities;

/**
 * Director
 * Singleton
 */
public class AutoDirector {

    public static AutoDirector instance;
    private AutoBuilder autoBuilder;

    private AutoDirector() {}

    public static AutoDirector getInstance() {
        if (instance == null) {
            instance = new AutoDirector();
        }

        return instance;
    }

    public void constructAuto() {
        autoBuilder.crearAuto();
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildPuertas();
        autoBuilder.buildMotor();
    }

    public void setAutoBuilder(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }

    public Auto getAuto() {
        return autoBuilder.getAuto();
    }
}

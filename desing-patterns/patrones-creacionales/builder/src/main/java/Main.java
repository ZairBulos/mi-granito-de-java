import entities.Auto;
import entities.AutoDirector;
import entities.FordBuilder;

public class Main {

    public static void main(String[] args) {
        AutoDirector director = AutoDirector.getInstance();
        director.setAutoBuilder(new FordBuilder());
        director.constructAuto();

        Auto auto = director.getAuto();
        System.out.println(auto.getMarca() + " " + auto.getModelo());
    }

}

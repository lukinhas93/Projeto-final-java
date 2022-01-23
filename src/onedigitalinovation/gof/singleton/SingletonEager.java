package onedigitalinovation.gof.singleton;
/**
 * Singleton "apressado".
 *
 * @author lukinhas93
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia () {

        return instancia;
    }
}

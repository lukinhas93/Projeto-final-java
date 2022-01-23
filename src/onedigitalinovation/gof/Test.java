package onedigitalinovation.gof;

import onedigitalinovation.gof.facade.Facade;
import onedigitalinovation.gof.singleton.SingletonEager;
import onedigitalinovation.gof.singleton.SingletonLazy;
import onedigitalinovation.gof.singleton.SingletonLazyHolder;
import onedigitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo =new ComportamentoDefensivo();
        Comportamento normal =new ComportamentoNormal();
        Comportamento agressivo =new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Lucas","1481000");


    }
}

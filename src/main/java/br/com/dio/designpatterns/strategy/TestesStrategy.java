package br.com.dio.designpatterns.strategy;

public class TestesStrategy {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento ofensivo = new ComportamentoOfensivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

    }
}

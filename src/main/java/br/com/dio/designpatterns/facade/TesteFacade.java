package br.com.dio.designpatterns.facade;

public class TesteFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Minoru", "12345678");
    }
}

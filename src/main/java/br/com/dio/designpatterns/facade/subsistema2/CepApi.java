package br.com.dio.designpatterns.facade.subsistema2;

import br.com.dio.designpatterns.singleton.SingletonEager;

public class CepApi {

    private static final CepApi instance = new CepApi();
    private CepApi(){}

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}

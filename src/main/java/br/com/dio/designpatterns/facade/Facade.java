package br.com.dio.designpatterns.facade;

import br.com.dio.designpatterns.facade.subsistema1.CrmService;
import br.com.dio.designpatterns.facade.subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

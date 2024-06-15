package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoDevs extends Dev {
    private Set<Dev> devsInscritos = new LinkedHashSet<>();

    public void adicionarDevs(String nome){
        devsInscritos.add(new Dev());
    }

    public void contarDevsInscritos(){
        if(conteudosInscritos.isEmpty() && devsInscritos.isEmpty()){
            System.out.println("Não há devs inscritos no Bootcamp");
        }else {
            System.out.println("Total de devs inscritos no Bootcamp: "+ devsInscritos.size());
        }
    }
}

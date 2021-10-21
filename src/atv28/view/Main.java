package view;

import java.util.ArrayList;

import controller.PessoaFisicaController;
import controller.PessoaJuridicaController;
import model.Endereco;
import model.PessoaFisica;
import model.PessoaJuridica;


public class Main {
    public static void main(String[] args) {

        PessoaJuridicaController pjc = new PessoaJuridicaController();
        PessoaFisicaController pfc = new PessoaFisicaController();

        PessoaFisica pf = new PessoaFisica();
        pf.id = 1;
        pf.nome = "João";
        pf.cpf = "11111111";
        //pf.enderecoResidencial = new Endereco();
        pf.enderecoResidencial.logradouro = "Rua X";
        pf.enderecoResidencial.numero = 333;
        pf.enderecoResidencial.complemento = "Bairu";
        pf.enderecoResidencial.cidade = "JF";
        pf.enderecoResidencial.estado = "MG";
        pfc.create(pf);

        PessoaFisica pf2 = new PessoaFisica();
        pf2.id = 2;
        pf2.nome = "Maria";
        pf2.cpf = "22222222";        
        pf2.enderecoResidencial.logradouro = "Rua A";
        pf2.enderecoResidencial.numero = 444;
        pf2.enderecoResidencial.complemento = "Aeroporto";
        pf2.enderecoResidencial.cidade = "JF";
        pf2.enderecoResidencial.estado = "MG";
        pfc.create(pf2);

        PessoaJuridica pj = new PessoaJuridica();
        pj.id = 1;
        pj.cnpj = "121212121212";
        pj.enderecoComercial.logradouro = "Rua Y";
        pj.enderecoComercial.numero = 9987;
        pj.enderecoComercial.complemento = "Borboleta";
        pj.enderecoComercial.cidade = "Juiz de Fora";
        pj.enderecoComercial.estado = "MG";
        pjc.create(pj);

        System.out.println(pjc.existe(pj));
        System.out.println(pfc.existe(pf));
        pfc.update(pf);

        System.out.println("Lista de Pessoas juridicas");
        ArrayList<PessoaFisica> pessoasFisicas = pfc.read();
        for (PessoaFisica pessoaFisica : pessoasFisicas) {
            System.out.println(pessoaFisica);
        }


        










    }
}

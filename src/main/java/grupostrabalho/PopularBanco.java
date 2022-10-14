/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package grupostrabalho;

import atuacao.Atuacao;
import atuacao.AtuacaoBeanLocal;
import endereco.Endereco;
import endereco.EnderecoBeanLocal;
import grupo.Grupo;
import grupo.GrupoBeanLocal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import pessoa.Pessoa;
import pessoa.PessoaBeanLocal;
import telefone.Telefone;
import util.TipoLogradouro;

/**
 *
 * @author IFNMG
 */
@Singleton
@Startup
public class PopularBanco implements PopularBancoLocal {

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Inject
    PessoaBeanLocal pessoaBean;
    
    @Inject
    EnderecoBeanLocal enderecoBean;
    
    @Inject
    GrupoBeanLocal grupoBean;
    
    @Inject
    AtuacaoBeanLocal atuacaoBean; 

    @PostConstruct
    @Override
    public void popularBanco() {
            
        //<editor-fold defaultstate="collapsed" desc="Criação de Endereços">

        Endereco end1 = new Endereco();

        end1.setTipoLogradouro(TipoLogradouro.RUA);
        end1.setLogradouro("Rua 1");
        end1.setNumero(1111);
        end1.setBairro("Humberto");

        Endereco end2 = new Endereco();
        end2.setTipoLogradouro(TipoLogradouro.AVENIDA);
        end2.setLogradouro("Avenida 2");
        end2.setNumero(2222);
        end2.setBairro("Doisberto");

        Endereco end3 = new Endereco();
        end3.setTipoLogradouro(TipoLogradouro.AVENIDA);
        end3.setLogradouro("Avenida 3");
        end3.setNumero(3333);
        end3.setBairro("Trêsberto");

        Endereco end4 = new Endereco();
        end4.setTipoLogradouro(TipoLogradouro.PRACA);
        end4.setLogradouro("Praça 4");
        end4.setNumero(4444);
        end4.setBairro("Quatroberto");

        
        enderecoBean.salvar(end1);
        enderecoBean.salvar(end2);
        enderecoBean.salvar(end3);
        enderecoBean.salvar(end4);
        
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Criação de Telefones">

        Telefone fone1 = new Telefone();
        fone1.setDdd(Byte.valueOf("11"));
        fone1.setNumero(11111111);

        Telefone fone2 = new Telefone();
        fone2.setDdd(Byte.valueOf("12"));
        fone2.setNumero(12121212);

        Telefone fone3 = new Telefone();
        fone3.setDdd(Byte.valueOf("13"));
        fone3.setNumero(13131313);

        Telefone fone4 = new Telefone();
        fone4.setDdd(Byte.valueOf("22"));
        fone4.setNumero(22222222);

        Telefone fone5 = new Telefone();
        fone5.setDdd(Byte.valueOf("44"));
        fone5.setNumero(44444444);

        Telefone fone6 = new Telefone();
        fone6.setDdd(Byte.valueOf("45"));
        fone6.setNumero(45454545);

        List<Telefone> lst_fones = new ArrayList<Telefone>();
        lst_fones.add(fone1);
        lst_fones.add(fone2);
        lst_fones.add(fone3);

        List<Telefone> lst_fones2 = new ArrayList<Telefone>();
        lst_fones2.add(fone4);

        List<Telefone> lst_fones3 = new ArrayList<Telefone>();
        lst_fones3.add(fone5);
        lst_fones3.add(fone6);


        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Criação de Pessoas">

        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Zaira");
        p1.setEmail("ana@mail.com");
        p1.setEndereco(end1);
        p1.setNascimento(LocalDate.parse("2001-01-01"));
        p1.setLstTelefones(lst_fones);
        

        Pessoa p2 = new Pessoa();
        p2.setNome("Beatriz Yana");
        p2.setEmail("beatriz@mail.com");
        p2.setNascimento(LocalDate.parse("2003-02-02"));
        p2.setLstTelefones(lst_fones2);
        p2.setEndereco(end2);

        Pessoa p3 = new Pessoa();
        p3.setNome("Cecília Xerxes");
        p3.setEmail("cecilia@mail.com");
        p3.setEndereco(end3);
        p3.setNascimento(LocalDate.parse("2003-03-03"));

        Pessoa p4 = new Pessoa();
        p4.setNome("Débora Wendel");
        p4.setEmail("debora@mail.com");
        p4.setNascimento(LocalDate.parse("2004-04-04"));
        p4.setLstTelefones(lst_fones3);
        p4.setEndereco(end4);

        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Criação de Grupos">

        Grupo g1 = new Grupo();
        g1.setNome("Estudo I");
        g1.setAtivo(Boolean.FALSE);
        g1.setLider(p1);

        Grupo g2 = new Grupo();
        g2.setNome("Estudo II");
        g2.setAtivo(Boolean.TRUE);
        g2.setLider(p2);

        Grupo g3 = new Grupo();
        g3.setNome("Estudo III");
        g3.setAtivo(Boolean.FALSE);
        g3.setLider(p3);

        Grupo g4 = new Grupo();
        g4.setNome("Estudo IV");
        g4.setAtivo(Boolean.TRUE);
        g4.setLider(p2);

        /*
        grupoBean.salvar(g1);
        grupoBean.salvar(g2);
        grupoBean.salvar(g3);
        grupoBean.salvar(g4);
        */
        //</editor-fold>

        p1.setLstGrupos(List.of(g1));
        p2.setLstGrupos(List.of(g1, g2,g4));
        p3.setLstGrupos(List.of(g1,g3,g4));
        p4.setLstGrupos(List.of(g1, g2,g3,g4));
        
        //<editor-fold defaultstate="collapsed" desc="Criação de Atuações">

        Atuacao atuacao1 = new Atuacao();
        atuacao1.setInicio(LocalDate.of(2012, 01, 01));
        atuacao1.setTermino(LocalDate.of(2022, 01, 11));
        atuacao1.setGrupo(g1);
        atuacao1.setPessoa(p1);

        Atuacao atuacao2 = new Atuacao();
        atuacao2.setInicio(LocalDate.of(2012, 01, 02));
        atuacao2.setTermino(LocalDate.of(2021, 01, 12));
        atuacao2.setGrupo(g1);
        atuacao2.setPessoa(p2);

        Atuacao atuacao3 = new Atuacao();
        atuacao3.setInicio(LocalDate.of(2013, 01, 03));
        atuacao3.setTermino(LocalDate.of(2021, 01, 13));
        atuacao3.setGrupo(g1);
        atuacao3.setPessoa(p3);

        Atuacao atuacao4 = new Atuacao();
        atuacao4.setInicio(LocalDate.of(2014, 01, 04));
        atuacao4.setTermino(LocalDate.of(2021, 01, 14));
        atuacao4.setGrupo(g1);
        atuacao4.setPessoa(p4);

        Atuacao atuacao5 = new Atuacao(); // Líder
        atuacao5.setInicio(LocalDate.of(2011, 01, 01));
        atuacao5.setTermino(LocalDate.of(2021, 11, 11));
        atuacao5.setGrupo(g1);
        atuacao5.setPessoa(p1);

        // Atuação - Grupo II
        Atuacao atuacao6 = new Atuacao();
        atuacao6.setInicio(LocalDate.of(2012, 01, 02));
        atuacao6.setGrupo(g2);
        atuacao6.setPessoa(p2);

        Atuacao atuacao7 = new Atuacao();
        atuacao7.setInicio(LocalDate.of(2012, 01, 02));
        atuacao7.setGrupo(g2);
        atuacao7.setPessoa(p4);

        // Atuação - Grupo III
        Atuacao atuacao8 = new Atuacao();
        atuacao8.setInicio(LocalDate.of(2012, 01, 03));
        atuacao8.setTermino(LocalDate.of(2023, 01, 13));
        atuacao8.setGrupo(g3);
        atuacao8.setPessoa(p3);

        Atuacao atuacao9 = new Atuacao();
        atuacao9.setInicio(LocalDate.of(2012, 01, 02));
        atuacao9.setTermino(LocalDate.of(2023, 01, 13));
        atuacao9.setGrupo(g3);
        atuacao9.setPessoa(p4);

        // Atuação - Grupo I
        Atuacao atuacao10 = new Atuacao();
        atuacao10.setInicio(LocalDate.of(2012, 01, 04));
        atuacao10.setTermino(LocalDate.of(2024, 01, 14));
        atuacao10.setGrupo(g4);
        atuacao10.setPessoa(p2);

        Atuacao atuacao11 = new Atuacao();
        atuacao11.setInicio(LocalDate.of(2012, 01, 04));
        atuacao11.setTermino(LocalDate.of(2024, 01, 14));
        atuacao11.setGrupo(g4);
        atuacao11.setPessoa(p3);

        Atuacao atuacao12 = new Atuacao();
        atuacao12.setInicio(LocalDate.of(2012, 01, 04));
        atuacao12.setTermino(LocalDate.of(2024, 01, 14));
        atuacao12.setGrupo(g4);
        atuacao12.setPessoa(p4);

        atuacaoBean.salvar(atuacao1);
        atuacaoBean.salvar(atuacao2);
        atuacaoBean.salvar(atuacao3);
        atuacaoBean.salvar(atuacao4);
        atuacaoBean.salvar(atuacao5);
        atuacaoBean.salvar(atuacao6);
        atuacaoBean.salvar(atuacao7);
        atuacaoBean.salvar(atuacao8);
        atuacaoBean.salvar(atuacao9);
        atuacaoBean.salvar(atuacao10);
        atuacaoBean.salvar(atuacao11);
        atuacaoBean.salvar(atuacao12);
        //</editor-fold>
        
        p1.setLstAtuacoes(List.of(atuacao1, atuacao2));
        p2.setLstAtuacoes(List.of(atuacao3, atuacao6, atuacao10));
        p3.setLstAtuacoes(List.of(atuacao4, atuacao8, atuacao11));
        p4.setLstAtuacoes(List.of(atuacao5, atuacao7, atuacao9, atuacao12));
        
        pessoaBean.salvar(p1);
        pessoaBean.salvar(p2);
        pessoaBean.salvar(p3);
        pessoaBean.salvar(p4);

    }
            
}

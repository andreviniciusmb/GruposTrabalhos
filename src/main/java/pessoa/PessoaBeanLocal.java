/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package pessoa;

import javax.ejb.Local;
import java.util.List;

/**
 *
 * @author andre-barros
 */
@Local
public interface PessoaBeanLocal {

    void salvar(Pessoa pessoa);

    List<pessoa.Pessoa> findAllPessoasNamedQuery();

    List<Pessoa> findAllPessoasQuery();

    List<Pessoa> findAllPessoasTypedQuery();

    List<Pessoa> findNomeNamedQuery();

    List<Pessoa> findNomeQuery();

    List<Object[]> findNomeTypedQuery();

    List<Pessoa> findNomePessoaEnderecoQuery();

    List<Object[]> findNomePessoaEnderecoTypedQuery();

    List<Pessoa> findNomePessoaEnderecoNamedQuery();

    List<Pessoa> findPessoasAvenidaQuery();

    List<Pessoa> findPessoasAvenidaTypedQuery();

    List<Pessoa> findPessoasAvenidaNamedQuery();

    List<Pessoa> findPessoasNaoPracaQuery();

    List<Pessoa> findPessoasNaoPracaTypedQuery();

    List<Pessoa> findPessoasNaoPracaNamedQuery();

    List<Pessoa> findNomeTelefoneQuery();

    List<Object[]> findNomeTelefoneTypedQuery();

    List<Pessoa> findNomeTelefoneNamedQuery();

    List<Pessoa> findPessoasPR();

    List<Pessoa> findPessoasRJ();

    List<Pessoa> findPessoasNaoTelefone();

    List<Pessoa> findTelefonePorPessoa();
    
}

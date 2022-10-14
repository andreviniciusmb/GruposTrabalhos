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

    List<Pessoa> findNomeTypedQuery();
    
}

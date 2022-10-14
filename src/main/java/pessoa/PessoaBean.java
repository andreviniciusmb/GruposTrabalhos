/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package pessoa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author andre-barros
 */
@Stateless
public class PessoaBean implements PessoaBeanLocal {

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    private EntityManager em; 
            
    @Override
    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }
    
    @Override
    public List<Pessoa> findAllPessoasQuery() {
        Query q = em.createQuery("SELECT p FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
    }
    
    @Override
    public List<Pessoa> findAllPessoasTypedQuery() {
        TypedQuery q = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
        return q.getResultList();
    }
    
    @Override
    public List<pessoa.Pessoa> findAllPessoasNamedQuery() {
        return em.createNamedQuery("Pessoa.findAll",Pessoa.class).getResultList();
    }

    
    @Override
    public List<Pessoa> findNomeNamedQuery() {
        return em.createNamedQuery("Pessoa.findNome",Pessoa.class).getResultList();
    }

    @Override
    public List<Pessoa> findNomeQuery() {
        Query q = em.createQuery("SELECT p.nome FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> findNomeTypedQuery() {
        TypedQuery q = em.createQuery("SELECT p.nome FROM Pessoa p", Pessoa.class);
        return q.getResultList();
    }
    
    
    
}

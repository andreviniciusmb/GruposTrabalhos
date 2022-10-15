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
    
    private String query3 = "SELECT p.nome,p.endereco FROM Pessoa p";
    private String query4 = "SELECT p FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1";
    private String query5 = "SELECT p FROM Pessoa p WHERE p.endereco.tipoLogradouro != 2";
    private String query6 = "SELECT p.nome,p.lst_telefones FROM Pessoa p";
            
    @PersistenceContext(unitName = "GruposTrabalhoPU")
    private EntityManager em; 
            
    @Override
    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }
    //<editor-fold defaultstate="collapsed" desc="Questão 1">
    
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
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questão 2">
    
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
    public List<Object[]> findNomeTypedQuery() {
        TypedQuery q = em.createQuery("SELECT p.nome FROM Pessoa p", Object[].class);
        return q.getResultList();
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Questão 3">
    
    @Override
    public List<Pessoa> findNomePessoaEnderecoQuery() {
        Query q = em.createQuery(query3);
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Object[]> findNomePessoaEnderecoTypedQuery() {
        TypedQuery q = em.createQuery(query3, Object[].class);
        return q.getResultList();
    }
    
    @Override
    public List<Pessoa> findNomePessoaEnderecoNamedQuery() {
        return em.createNamedQuery("Pessoa.findNomeEndereco",Pessoa.class).getResultList();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Questão 4">
   
    @Override
    public List<Pessoa> findPessoasAvenidaQuery() {
        Query q = em.createQuery(query4);
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasAvenidaTypedQuery() {
        TypedQuery q = em.createQuery(query4, Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasAvenidaNamedQuery() {
        return em.createNamedQuery("Pessoa.findPessoasAvenida",Pessoa.class).getResultList();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Questão 5">
    
    @Override
    public List<Pessoa> findPessoasNaoPracaQuery() {
        Query q = em.createQuery(query5);
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasNaoPracaTypedQuery() {
        TypedQuery q = em.createQuery(query5, Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasNaoPracaNamedQuery() {
        return em.createNamedQuery("Pessoa.findPessoasAvenida",Pessoa.class).getResultList();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Questão 6"> 

    @Override
    public List<Pessoa> findNomeTelefoneQuery() {
        Query q = em.createQuery(query6);
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Object[]> findNomeTelefoneTypedQuery() {
        TypedQuery q = em.createQuery(query6, Object[].class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> findNomeTelefoneNamedQuery() {
        return em.createNamedQuery("Pessoa.findNomeTelefone",Pessoa.class).getResultList();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Questão 8">
    
    @Override
    public List<Pessoa> findPessoasPR() {
        return em.createNamedQuery("Pessoa.findPessoasPR",Pessoa.class).getResultList();
    }

    @Override
    public List<Pessoa> findPessoasRJ() {
        return em.createNamedQuery("Pessoa.findPessoasRJ",Pessoa.class).getResultList();
    }
    //</editor-fold>

    @Override
    public List<Pessoa> findPessoasNaoTelefone() {  // Questão 9
        return em.createNamedQuery("Pessoa.findPessoasNaoTelefone",Pessoa.class).getResultList();
    }

    @Override
    public List<Pessoa> findTelefonePorPessoa() {   // Questão 10
        return em.createNamedQuery("Pessoa.findTelefonePorPessoa",Pessoa.class).getResultList();
    }
    
    
}

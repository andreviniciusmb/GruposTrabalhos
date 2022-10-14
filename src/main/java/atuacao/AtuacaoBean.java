/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package atuacao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre-barros
 */
@Stateless
public class AtuacaoBean implements AtuacaoBeanLocal {

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    private EntityManager em; 
    
    @Override
    public void salvar(Atuacao atuacao) {
        em.persist(atuacao);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

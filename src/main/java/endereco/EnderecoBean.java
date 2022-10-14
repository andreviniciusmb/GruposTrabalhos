/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package endereco;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre-barros
 */
@Stateless
public class EnderecoBean implements EnderecoBeanLocal {

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    private EntityManager em;
    
    /**
     *
     * @param endereco
     */
    //@PostConstruct
    @Override
    public void salvar(Endereco endereco) {
        em.persist(endereco);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

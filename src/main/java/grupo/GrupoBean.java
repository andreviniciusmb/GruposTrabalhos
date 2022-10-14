/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package grupo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre-barros
 */
@Stateless
public class GrupoBean implements GrupoBeanLocal {

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    private EntityManager em;
    
    @Override
    public void salvar(Grupo grupo) {
        em.persist(grupo);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package grupo;

import java.util.List;
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

    @Override
    public List<Grupo> findGruposNaoAtivos() {
        return em.createNamedQuery("Grupo.findGruposNaoAtivos",Grupo.class).getResultList();
    }

    @Override
    public List<Grupo> findLideres() {
        return em.createNamedQuery("Grupo.findLideres",Grupo.class).getResultList();
    }

    @Override
    public List<Grupo> findGrupoOrdenado(String grupo) {
        return em.createNamedQuery("Grupo.findGrupoOrdenado",Grupo.class).setParameter("grupo", grupo).getResultList();
    }

    @Override
    public List<Grupo> findGruposLider(String lider) {
        return em.createNamedQuery("Grupo.findGruposLider",Grupo.class).setParameter("lider", lider).getResultList();
    }

    @Override
    public List<Grupo> findAtuacaoMembro(String membro) {
        return em.createNamedQuery("Grupo.findAtuacaoMembro",Grupo.class).setParameter("membro", membro).getResultList();
    }

    @Override
    public List<Grupo> findGruposTrecho(String trecho) {
        return em.createNamedQuery("Grupo.findGruposTrecho",Grupo.class).setParameter("trecho", trecho).getResultList();
    }

    @Override
    public List<Grupo> findGruposQtdMembros() {
        return em.createNamedQuery("Grupo.findGruposQtdMembros",Grupo.class).getResultList();
    }

    @Override
    public List<Grupo> findGruposQtdAtuacoes(int totalAtuacoes) {
        return em.createNamedQuery("Grupo.findGruposQtdMembros",Grupo.class).setParameter("totalAtuacoes", totalAtuacoes).getResultList();
    }

    @Override
    public List<Grupo> findMembrosAnoGrupo(int ano, String grupo) {
        return em.createNamedQuery("Grupo.findMembrosAnoGrupo",Grupo.class).setParameter("grupo", grupo).setParameter("ano", ano).getResultList();
    }

    @Override
    public List<Grupo> findMembrosGruposSemTermino() {
        return em.createNamedQuery("Grupo.findMembrosGruposSemTermino",Grupo.class).getResultList();
    }

    @Override
    public List<Grupo> findAllGruposOrderGrupo() {
        return em.createNamedQuery("Grupo.findAllGruposOrderGrupo",Grupo.class).getResultList();
    }
    
    @Override
    public List<Grupo> findAllGruposOrderLider() {
        return em.createNamedQuery("Grupo.findAllGruposOrderLider",Grupo.class).getResultList();
    }
    
    @Override
    public List<Grupo> findAllGruposOrderMembro() {
        return em.createNamedQuery("Grupo.findAllGruposOrderMembro",Grupo.class).getResultList();
    }
    
}

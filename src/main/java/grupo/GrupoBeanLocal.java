/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package grupo;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author andre-barros
 */
@Local
public interface GrupoBeanLocal {

    void salvar(Grupo grupo);

    List<Grupo> findGruposNaoAtivos();

    List<Grupo> findLideres();

    List<Grupo> findGrupoOrdenado(String grupo);

    List<Grupo> findGruposLider(String lider);

    List<Grupo> findAtuacaoMembro(String membro);

    List<Grupo> findGruposTrecho(String trecho);

    List<Grupo> findGruposQtdMembros();

    List<Grupo> findGruposQtdAtuacoes(int totalAtuacoes);

    List<Grupo> findMembrosAnoGrupo(int ano, String grupo);

    List<Grupo> findMembrosGruposSemTermino();

    List<Grupo> findAllGruposOrderGrupo();
    
    List<Grupo> findAllGruposOrderLider();
    
    List<Grupo> findAllGruposOrderMembro();
    
}

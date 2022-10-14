/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package atuacao;

import javax.ejb.Local;

/**
 *
 * @author andre-barros
 */
@Local
public interface AtuacaoBeanLocal {

    void salvar(Atuacao atuacao);
    
}

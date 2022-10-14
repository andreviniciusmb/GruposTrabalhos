/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package endereco;

import javax.ejb.Local;

/**
 *
 * @author andre-barros
 */
@Local
public interface EnderecoBeanLocal {

    void salvar(Endereco endereco);
    
}

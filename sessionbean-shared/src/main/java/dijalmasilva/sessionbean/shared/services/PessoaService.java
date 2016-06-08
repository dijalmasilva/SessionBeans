/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.sessionbean.shared.services;

import dijalmasilva.sessionbean.shared.entidades.Pessoa;
import java.util.List;

/**
 *
 * @author dijalma
 */
public interface PessoaService {

    boolean save(Pessoa pessoa);
    
    List<Pessoa> all();
}

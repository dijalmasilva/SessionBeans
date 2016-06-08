/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.sessionbean.core.services;

import dijalmasilva.sessionbean.shared.entidades.Pessoa;
import dijalmasilva.sessionbean.shared.services.PessoaService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author dijalma
 */
@Stateless
public class PessoaServiceImpl implements PessoaService, Serializable{

    @PersistenceContext(unitName = "sessionbean")
    private EntityManager em;
    
    @Override
    public boolean save(Pessoa pessoa) {
        em.persist(pessoa);
        return true;
    }

    @Override
    public List<Pessoa> all() {
        
        Query query = em.createNativeQuery("Select * from Pessoa", Pessoa.class);
        return query.getResultList();
    }
    
}

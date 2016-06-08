/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.sessionbean.webapp;

import dijalmasilva.sessionbean.shared.entidades.Pessoa;
import dijalmasilva.sessionbean.shared.services.PessoaService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author dijalma
 */
@Named(value = "PessoaMB")
public class ControladorPessoa implements Serializable{
    
    @EJB
    private PessoaService service;
    private Pessoa pessoa;

    public ControladorPessoa() {
        this.pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        if (pessoa == null){
            this.pessoa = new Pessoa();
        }
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void reset(){
        this.pessoa = null;
    }
    
    public void salvar(){
        this.service.save(pessoa);
    }
    
    public List<Pessoa> listar(){
        return this.service.all();
    }
}

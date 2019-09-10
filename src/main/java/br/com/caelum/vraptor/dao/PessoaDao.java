/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.vraptor.dao;

import br.com.caelum.vraptor.model.Pessoa;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface PessoaDao {
    public void adiciona(Pessoa pessoa);
    public void remove(Pessoa pessoa);
    public Pessoa buscaPorId(Long id);
    public List<Pessoa> lista();
    public void altera(Pessoa pessoa);
    
}

package br.com.caelum.vraptor.dao;

import br.com.caelum.vraptor.model.Pessoa;
import java.util.List;

public interface PessoaDao {
    public void adiciona(Pessoa pessoa);
    public void remove(Pessoa pessoa);
    public Pessoa buscaPorId(Long id);
    public List<Pessoa> lista();
    public void altera(Pessoa pessoa);
    
}

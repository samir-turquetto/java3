package br.com.caelum.vraptor.dao;

import br.com.caelum.vraptor.model.FolhaPagamento;
import br.com.caelum.vraptor.model.Pessoa;
import java.util.List;

public interface FolhaPagamentoDao {

    public void adiciona(FolhaPagamento folhaPagamento);

    public void remove(FolhaPagamento folhaPagamento);

    public FolhaPagamento buscaPorId(Long id);

    public List<FolhaPagamento> lista();

    public void altera(FolhaPagamento folhaPagamento);

    public void calcularSalarioLiquido(Pessoa pessoa);

}

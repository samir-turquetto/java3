package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.FolhaPagamentoDao;
import br.com.caelum.vraptor.dao.PessoaDao;
import br.com.caelum.vraptor.model.FolhaPagamento;
import br.com.caelum.vraptor.model.Pessoa;
import javax.inject.Inject;

public class FolhaPagamentoController {

    private final Result result;
    private final FolhaPagamentoDao dao;
    private final PessoaDao daoPessoa;

    @Deprecated
    public FolhaPagamentoController() {
        this(null, null, null);
    }

    @Inject
    public FolhaPagamentoController(Result result, FolhaPagamentoDao dao, PessoaDao pessoa) {
        this.result = result;
        this.dao = dao;
        this.daoPessoa = pessoa;
    }

    @Path("/")
    public void inicial() {
    }

    @Get
    public void formulario() {
    }

    @Get
    public void lista() {
        result.include("FolhaPagamentoList", dao.lista());
    }

    @Post
    public void adicionar(FolhaPagamento folhaPagamento) {
        dao.adiciona(folhaPagamento);
        result.include("adicionado", "Folha de pagamento adicionada com sucesso!");
        result.redirectTo(this).lista();
    }

    @Post
    public void alterar(FolhaPagamento folhaPagamento) {
        dao.altera(folhaPagamento);
        result.include("alterado", "Folha de pagamento alterada com sucesso!");
        result.redirectTo(this).lista();
    }

    @Path("/folhaPagametno/remover")
    public void remover(Long id) {
        FolhaPagamento folhaPagamento = dao.buscaPorId(id);
        dao.remove(folhaPagamento);
        result.include("deletado", "Folha de pagamento deletado com sucesso!");
        result.redirectTo(FolhaPagamentoController.class).lista();
    }

    @Path("/folhaPagamentos/editar")
    public void editar(Long id) {
        FolhaPagamento folhaPagamento = dao.buscaPorId(id);
        result.include(folhaPagamento);
        result.of(this).formulario();
    }

    @Path("/folhaPagamentos/calcularSalarioLiquidos")
    public void calcularSalarioLiquido(Long id) {
        Pessoa pessoa = daoPessoa.buscaPorId(id);
        dao.calcularSalarioLiquido(pessoa);
        result.redirectTo(FolhaPagamentoController.class).lista();
    }
}

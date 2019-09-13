package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.PessoaDao;
import br.com.caelum.vraptor.model.Pessoa;
import javax.inject.Inject;

@Controller
public class PessoaController {

    private final Result result;
    private final PessoaDao dao;

    @Deprecated
    public PessoaController() {
        this(null, null);
    }

    @Inject
    public PessoaController(Result result, PessoaDao dao) {
        this.result = result;
        this.dao = dao;
    }

    @Path("/")
    public void inicial() {
    }

    @Get
    public void formulario() {
        
    }

    @Get
    public void lista() {
        result.include("pessoaList", dao.lista());
    }

    @Post
    public void adicionar(Pessoa pessoa) {
        dao.adiciona(pessoa);
        result.include("adicionado", "Pessoa adicionada com sucesso!");
        result.redirectTo(this).lista();
    }

    @Post
    public void alterar(Pessoa pessoa) {
        dao.altera(pessoa);
        result.include("alterado", "Pessoa alterada com sucesso!");
        result.redirectTo(this).lista();
    }

    @Path("/pessoa/remover")
    public void remover(Long id) {
        Pessoa pessoa = dao.buscaPorId(id);
        dao.remove(pessoa);
        result.include("deletado", "Pessoa deletado com sucesso!");
        result.redirectTo(PessoaController.class).lista();
    }

    @Path("/pessoa/editar")
    public void editar(Long id) {
        Pessoa pessoa = dao.buscaPorId(id);
        result.include(pessoa);
        result.of(this).formulario();
    }
}

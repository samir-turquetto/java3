package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.PessoaDao;
import javax.inject.Inject;

@Controller
public class PessoaController {
    
    private final Result result;
    private final PessoaDao dao;
    
    @Deprecated
    public PessoaController(){
        this(null, null);
    }
    
    @Inject
    public PessoaController(Result result, PessoaDao dao){
        this.result = result;
        this.dao = dao;
    }
    
    @Path("/")
    public void inicial(){    
    }
    
}

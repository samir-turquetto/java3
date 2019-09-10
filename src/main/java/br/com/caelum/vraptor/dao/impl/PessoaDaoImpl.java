package br.com.caelum.vraptor.dao.impl;

import br.com.caelum.vraptor.dao.PessoaDao;
import br.com.caelum.vraptor.model.Pessoa;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

@RequestScoped
public class PessoaDaoImpl implements PessoaDao {

    private final EntityManager em;

    @Inject
    public PessoaDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Deprecated
    public PessoaDaoImpl() {
        this(null);
    }

    @Override
    public void adiciona(Pessoa pessoa) {
        em.persist(pessoa);
        em.close();
    }

    @Override
    public void remove(Pessoa pessoa) {
        em.remove(em.merge(pessoa));
        em.close();
    }

    @Override
    public Pessoa buscaPorId(Long id) {
        return em.find(Pessoa.class, id);
    }

    @Override
    public List<Pessoa> lista() {
        CriteriaQuery<Pessoa> query = em.getCriteriaBuilder().createQuery(Pessoa.class);
        query.select(query.from(Pessoa.class));
        List<Pessoa> lista = em.createQuery(query).getResultList();
        em.close();
        return lista;
    }

    @Override
    public void altera(Pessoa pessoa) {
        em.merge(pessoa);
        em.close();
    }

}

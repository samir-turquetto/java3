package br.com.caelum.vraptor.dao.impl;

import br.com.caelum.vraptor.dao.FolhaPagamentoDao;
import br.com.caelum.vraptor.dao.PessoaDao;
import br.com.caelum.vraptor.model.FolhaPagamento;
import br.com.caelum.vraptor.model.Pessoa;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class FolhaPagamentoDaoImpl implements FolhaPagamentoDao {

    private final EntityManager em;
    private FolhaPagamento folhaPagamento;
    private double salario = folhaPagamento.getSalarioBruto();

    @Inject
    public FolhaPagamentoDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Deprecated
    public FolhaPagamentoDaoImpl() {
        this(null);
    }

    @Override
    public void adiciona(FolhaPagamento folhaPagamento) {
        em.persist(folhaPagamento);
        em.close();
    }

    @Override
    public void remove(FolhaPagamento folhaPagamento) {
        em.remove(folhaPagamento);
        em.close();
    }

    @Override
    public FolhaPagamento buscaPorId(Long id) {
        return em.find(FolhaPagamento.class, id);
    }

    @Override
    public List<FolhaPagamento> lista() {
        CriteriaQuery<FolhaPagamento> query = em.getCriteriaBuilder().createQuery(FolhaPagamento.class);
        query.select(query.from(FolhaPagamento.class));
        List<FolhaPagamento> lista = em.createQuery(query).getResultList();
        em.close();
        return lista;
    }

    @Override
    public void altera(FolhaPagamento folhaPagamento) {
        em.merge(folhaPagamento);
        em.close();
    }

    public void calcularSalarioLiquido(Pessoa pessoa) {
        double salarioLiquido = folhaPagamento.getSalarioBruto() - folhaPagamento.getDesconto();
        folhaPagamento.setSalarioLiquido(salarioLiquido);
    }

    private void CalcularDesconto(Pessoa pessoa) {
        double desconto = CalcularFGTS(pessoa) + CalcularINSS(pessoa);
        folhaPagamento.setDesconto(desconto);
    }

    private Double CalcularINSS(Pessoa pessoa) {
        if (salario < 1751.82) {
            return salario * 0.08;
        } else if (salario > 1751.81 && salario < 2919.73) {
            return salario * 0.09;
        } else if (salario > 2919.72 && salario < 5839.46) {
            return salario * 0.11;
        } else {
            return 642.34;
        }
    }

    private Double CalcularFGTS(Pessoa pessoa) {
        return salario * 0.08;
    }
}

package br.itau.com.cartao.models;

import java.math.BigDecimal;

public class Fatura {
    private BigDecimal total;

    private Iterable<Lancamento> lancamentos;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Iterable<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(Iterable<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }
}

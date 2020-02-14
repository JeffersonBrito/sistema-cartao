package br.itau.com.cartao.repositories;

import br.itau.com.cartao.models.Lancamento;
import org.springframework.data.repository.CrudRepository;

public interface LancamentoRepository extends CrudRepository<Lancamento, Integer> {
    Iterable<Lancamento> findAllByCartao_numero(String numero);
}

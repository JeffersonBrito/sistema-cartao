package br.itau.com.modulo2revisao206.repositories;

import br.itau.com.modulo2revisao206.models.Lancamento;
import org.springframework.data.repository.CrudRepository;

public interface LancamentoRepository extends CrudRepository<Lancamento, Integer> {
    Iterable<Lancamento> findAllByCartao_numero(String numero);
}

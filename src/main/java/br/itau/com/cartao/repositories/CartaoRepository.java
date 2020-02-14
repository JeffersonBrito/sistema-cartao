package br.itau.com.cartao.repositories;

import br.itau.com.cartao.models.Cartao;
import org.springframework.data.repository.CrudRepository;

public interface CartaoRepository extends CrudRepository<Cartao, String> {}

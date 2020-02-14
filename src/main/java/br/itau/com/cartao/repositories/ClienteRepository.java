package br.itau.com.cartao.repositories;

import br.itau.com.cartao.models.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Optional<Cliente> findByCpf(String cpf);
}

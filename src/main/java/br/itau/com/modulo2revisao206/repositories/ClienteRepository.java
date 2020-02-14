package br.itau.com.modulo2revisao206.repositories;

import br.itau.com.modulo2revisao206.models.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Optional<Cliente> findByCpf(String cpf);
}

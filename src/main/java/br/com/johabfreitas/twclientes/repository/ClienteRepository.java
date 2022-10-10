package br.com.johabfreitas.twclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.twclientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

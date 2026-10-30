package br.com.fiap.Spring2ess.repository;

import br.com.fiap.Spring2ess.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> { }

package br.com.ilannafreire.repository;

import br.com.ilannafreire.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}

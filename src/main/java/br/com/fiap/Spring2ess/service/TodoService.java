package br.com.fiap.Spring2ess.service;

import br.com.fiap.Spring2ess.model.Todo;
import br.com.fiap.Spring2ess.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;


    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<Todo> findAll() {
        return this.todoRepository.findAll();
    }


    public Optional<Todo> findById(Long id) {
        return this.todoRepository.findById(id);
    }


    public Todo save(Todo todo) {
        return this.todoRepository.save(todo);
    }


    public void delete(Long id) {
        this.todoRepository.deleteById(id);
    }
}
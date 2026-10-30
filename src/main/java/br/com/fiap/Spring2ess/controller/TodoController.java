package br.com.fiap.Spring2ess.controller;

import br.com.fiap.Spring2ess.model.Todo;
import br.com.fiap.Spring2ess.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/todo", produces = "application/json")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
        // Dependency Injection
    }


    // PUT /todo/123
    // DELETE /todo/123


    // GET /todo
    @GetMapping()
    public List<Todo> getAll() {
        return this.todoService.findAll();
    }

    // GET /todo/123
    @GetMapping("/{id}")
    public ResponseEntity<Todo> get(@PathVariable("id") Long idTodo) {
        return ResponseEntity.of(this.todoService.findById(idTodo));
    }

    // POST /todo
    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return this.todoService.save(todo);
    }
}
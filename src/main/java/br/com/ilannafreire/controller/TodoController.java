package br.com.ilannafreire.controller;


import br.com.ilannafreire.entity.Todo;
import br.com.ilannafreire.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    List<Todo> list(){
        return todoService.list();
    }

    List<Todo> update(){
        return todoService.update(todo);

    }

    List<Todo> delete(){

    }
}

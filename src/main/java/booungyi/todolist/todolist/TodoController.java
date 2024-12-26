package booungyi.todolist.todolist;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/Todolist")
    public void somlists(@Valid @RequestBody TodolistDTO dto) {
        todoService.create(dto);

    }
}

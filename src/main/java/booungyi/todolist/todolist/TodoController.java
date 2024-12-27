package booungyi.todolist.todolist;

import booungyi.todolist.comment.Comment;
import jakarta.validation.OverridesAttribute;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/Todolist/{id}")
    public List<Comment> dto(@PathVariable Long id) {
        return todoService.findname(id);
    }

    //    @GetMapping("/Todolist/{id}")
//    @GetMapping("Todolist/searchcount")
//    public TodolistResponse counts(@PathVariable Long id) {
//        todoService.responsesearch(id);
//    }
}

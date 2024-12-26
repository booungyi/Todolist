package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import booungyi.todolist.todolist.TodolistDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping("/comments")
    public void create(@Valid @RequestBody CommentDTO dto ,@Valid @RequestParam Todolist id) {
        service.create(dto, id);
    }

    @GetMapping("/comments/{id}")
    public CommentResponse get(@PathVariable Long id) {
        return service.read(id);
    }

    @DeleteMapping("/comments/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/comments/{id}")
    public void edit(@Valid @RequestBody CommentDTO dto, @PathVariable Long id) {
        service.edit(dto, id);
    }
}

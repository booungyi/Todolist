package booungyi.todolist.comment;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping("/comments")
    public void create(@Valid @RequestBody CommentDTO dto) {
        service.create(dto);
    }
//
//    @GetMapping("/comments")
//    public void get(@RequestParam CommentService commentService) {
//        commentService.read(new Comment());
//    }
//
//    @DeleteMapping("/comments")
//    public void delete(@RequestParam CommentService commentService) {
//        commentService.delete(new Comment());
//    }
//
//    @PutMapping("/comments")
//    public void edit(@Valid @RequestBody CommentService commentService, @RequestParam Long id) {
//        commentService.edit(new Comment(), id);
//    }
}

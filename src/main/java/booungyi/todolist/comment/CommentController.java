package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import booungyi.todolist.todolist.TodolistDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/comments/{id}")
    public CommentResponse get(@PathVariable Long id) {
        return service.read(id);
    }

    @DeleteMapping("/comments/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    //할 일이 속한 리스트를 다른 리스트로 변경
    @PutMapping("/comments/{id}")
    public void edit(@Valid @RequestBody CommentDTO dto) {
        service.edit(dto);
    }

    //속한 리스트에 관계 없이 모든 할 일 보기
    @GetMapping("/comments")
    public List<Comment> dtd() {
        return service.find();
    }
    //- 완료/미완료 상태인 할 일만 보기
    @GetMapping("/comments/search")
    public List<Comment> iscomplete(@RequestParam boolean iscomplete) {
        return service.check(iscomplete);
    }

    //- 할 일 완료 처리
    @PutMapping("/comments/{id}/complete")
    public void complet(@PathVariable Long id) {
        service.complet(id);
    }
}

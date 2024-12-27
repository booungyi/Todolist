package booungyi.todolist.comment;

import booungyi.todolist.todolist.TodoRepository;
import booungyi.todolist.todolist.Todolist;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    CommentRepository commentRepository;

    TodoRepository todoRepository;

    public CommentService(CommentRepository commentRepository, TodoRepository todoRepository) {
        this.commentRepository = commentRepository;
        this.todoRepository = todoRepository;

    }

    public void create(CommentDTO dto) {
        Todolist todolist = todoRepository.findById(dto.todolist()).orElseThrow();
        commentRepository.save(new Comment(
                dto.contents(),
                dto.times(),
                todolist)
        );
    }

    public CommentResponse read(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow();
        return new CommentResponse(
                comment.getContents(),
                comment.getTimes(),
                comment.getTodolist().getId());
    }

    public void delete(Long id) {
        commentRepository.deleteById(id);
    }

    @Transactional
    public void edit(CommentDTO dto) {
        Comment comment = commentRepository.findById(dto.id()).orElseThrow();
        Todolist todolist = todoRepository.findById(dto.todolist()).orElseThrow();
        comment.setContents(dto.contents());
        comment.setTimes(dto.times());
        comment.setTodolist(todolist);
    }

    @Transactional
    public void complet(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow();
        comment.complet();
    }

    public List<Comment> find() {
        return commentRepository.findAll();
    }

    public List<Comment> findname(Long id) {
        Todolist todolist = todoRepository.findById(id).orElseThrow();
        return commentRepository.findByTodolist(todolist);
    }

    public List<Comment> check(boolean iscomplete) {
        return commentRepository.findByIsCompleted(iscomplete);
    }
}

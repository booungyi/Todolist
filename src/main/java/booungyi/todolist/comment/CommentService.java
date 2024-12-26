package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import booungyi.todolist.todolist.TodolistDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void create(CommentDTO dto, Todolist id) {
       Comment comment = commentRepository.findById(id.getId()).orElseThrow();
        commentRepository.save(new Comment(dto.titles(), dto.contents(),
                dto.times(), dto.checked()
        ));
    }

    public CommentResponse read(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow();
        return new CommentResponse(comment.getId(),
                comment.getContents(),
                comment.getTimes(),
                comment.getTitles(),
                comment.getChecked());
    }

    public void delete(Long id) {
        commentRepository.deleteById(id);
    }

    @Transactional
    public void edit(CommentDTO dto, Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow();
        comment.setContents(dto.contents());
        comment.setTitles(dto.titles());
        comment.setChecked(dto.checked());

    }
}

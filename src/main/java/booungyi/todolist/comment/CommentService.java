package booungyi.todolist.comment;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void create(CommentDTO dto) {
        commentRepository.save(new Comment());
    }

//    public void read(Comment comment) {
//        commentRepository.findById(comment.getId());
//    }
//
//    public void delete(Comment comment) {
//        commentRepository.deleteById(comment.getId());
//    }
//
//    public void edit(Comment comment, Long id) {
//        commentRepository.findById(comment.getId()).orElseThrow();
//        commentRepository.save(new Comment());
//    }
}

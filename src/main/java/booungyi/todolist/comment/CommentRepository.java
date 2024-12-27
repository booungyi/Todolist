package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByIsCompleted(boolean iscompleted);
    List<Comment> findByTodolist(Todolist todolist);

    int countByTodolist(Long todolistcount);
}

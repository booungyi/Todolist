package booungyi.todolist.todolist;

import booungyi.todolist.comment.Comment;
import booungyi.todolist.comment.CommentDTO;
import booungyi.todolist.comment.CommentRepository;
import booungyi.todolist.comment.CommentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    TodoRepository todoRepository;

    @Autowired
    CommentRepository commentRepository;


    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Comment> findname(Long id) {
        Todolist todolist = todoRepository.findById(id).orElseThrow();
        return commentRepository.findByTodolist(todolist);
    }

    public void create(TodolistDTO dto) {
        todoRepository.save(new Todolist(
                dto.name()));

    }
    // TodolistResponse 에는 (할일 목록이름 , 할일 개수)
    // 그걸 리스트 안에 넣어서 만들건데
    public List<TodolistResponse> responsesearch() {
        commentRepository.countByTodolist()

    }
}

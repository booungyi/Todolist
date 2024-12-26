package booungyi.todolist.todolist;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void create(TodolistDTO dto) {
        todoRepository.save(new Todolist(dto.name()));
    }
}

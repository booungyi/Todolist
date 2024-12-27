package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import booungyi.todolist.todolist.TodolistDTO;

public record CommentDTO(
        Long id,
        String contents,
        String times,
        Long todolist
) {
}

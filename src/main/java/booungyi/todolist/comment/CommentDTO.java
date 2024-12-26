package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import booungyi.todolist.todolist.TodolistDTO;

public record CommentDTO(
        String titles,
        String contents,
        String times,
        String checked
) {
}

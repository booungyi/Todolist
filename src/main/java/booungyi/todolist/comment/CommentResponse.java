package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import booungyi.todolist.todolist.TodolistDTO;

public record CommentResponse (Long id,
                               String contents,
                               String times,
                               String titles,
                               String checked){
}


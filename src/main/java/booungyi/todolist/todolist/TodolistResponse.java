package booungyi.todolist.todolist;

import booungyi.todolist.comment.Comment;

import java.util.List;

public record TodolistResponse(
        String todolistname,
        int count) { }

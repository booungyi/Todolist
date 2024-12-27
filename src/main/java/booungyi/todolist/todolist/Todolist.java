package booungyi.todolist.todolist;

import booungyi.todolist.comment.Comment;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Todolist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "todolist")
    private List<Comment> comments;

    public Todolist() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Todolist(String name) {
        this.name = name;
    }
}

package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contents; //내용
    private String times; //할 시간

    @ManyToOne
    @JoinColumn(nullable = false)
    private Todolist todolist;
    private boolean isCompleted = false;

    public Comment(String contents, String times, Todolist todolist) {
        this.contents = contents;
        this.times = times;
        this.todolist = todolist;
    }

    public void complet() {
        isCompleted = true;
    }

    public String getContents() {
        return contents;
    }

    public String getTimes() {
        return times;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setTodolist(Todolist todolist) {
        this.todolist = todolist;
    }

    public Comment() {
    }

    public Todolist getTodolist() {
        return todolist;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    public void setTimes(String times) {
        this.times = times;
    }
}

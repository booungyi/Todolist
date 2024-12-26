package booungyi.todolist.comment;

import booungyi.todolist.CommentList;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment; //할 내용
    private String time; //할 시간
    private String date; //어느 날에 할건지
//    private List<CommentList> commentLists;

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }
}

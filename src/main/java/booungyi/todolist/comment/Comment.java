package booungyi.todolist.comment;

import booungyi.todolist.todolist.Todolist;
import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titles; //할 카테고리
    private String contents; //내용
    private String times; //할 시간
    private String checked;


    @ManyToOne
    @JoinColumn(name = "todolist_id")
    private Todolist todolist;

    public Comment(Todolist todolist, String titles, String contents, String times, String checked) {

    }


    public Comment(String titles, String contents, String times, String checked) {
        this.titles = titles;
        this.contents = contents;
        this.times = times;
        this.checked = checked;
    }

    //    private List<CommentList> commentLists;
    public Long getId() {
        return id;
    }

    public String getTitles() {
        return titles;
    }

    public String getContents() {
        return contents;
    }

    public String getTimes() {
        return times;
    }

    public String getChecked() {
        return checked;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}

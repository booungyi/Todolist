//package booungyi.todolist.commentlist;
//
//import booungyi.todolist.comment.Comment;
//import jakarta.persistence.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class CommentList {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    String commentList; //할 일 목록
//    @ManyToOne
//    List<Comment>comments = new ArrayList<>();
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getCommentList() {
//        return commentList;
//    }
//
//    public List<Comment> getComments() {
//        return comments;
//    }
//}

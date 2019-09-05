package project.sppractice.service;

import project.sppractice.domain.Board;
import project.sppractice.model.Comment;
import project.sppractice.model.Post;

public interface BoardService {

    public Post addPost(Post post) throws Exception;

    public Board updateBoard(Board board) throws Exception;

    public Comment addComment(Comment comment) throws Exception;
}

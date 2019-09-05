package project.sppractice.service.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sppractice.domain.Board;
import project.sppractice.model.Comment;
import project.sppractice.repository.CommentRepository;

import java.util.Optional;

@Service
public class CommentManagerImpl implements CommentManager, BoardManager {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Board update(Board board) throws Exception {
        Optional<Comment> preComment = commentRepository.findById(board.getId());
        Comment updatedComment = preComment.get();
        updatedComment.setContents(board.getContents());
        updatedComment = commentRepository.save(updatedComment);
        board.setContents(updatedComment.getContents());
        return board;
    }

    @Override
    public String getType() {
        return "comment";
    }
}

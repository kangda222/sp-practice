package project.sppractice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sppractice.domain.Board;
import project.sppractice.model.Comment;
import project.sppractice.model.Post;
import project.sppractice.repository.PostRepository;
import project.sppractice.service.manager.BoardManager;
import project.sppractice.service.manager.CommentManager;
import project.sppractice.service.manager.PostManager;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    PostManager postManager;

    @Autowired
    CommentManager commentManager;

    @Autowired
    List<BoardManager> listBoardManager;

    private static final Map<String, BoardManager> listedBoardManager=new HashMap<>();

    @PostConstruct
    public void init(){
        for(BoardManager service : listBoardManager){
            listedBoardManager.put(service.getType(),service);
        }
    }

    @Override
    public Post addPost(Post post) throws Exception {
        log.debug("BoardServiceImpl.addPost");
        return postManager.addPost(post);
    }

    @Override
    public Board updateBoard(Board board) throws Exception {
        return listedBoardManager.get(board.getType()).update(board);
    }

    @Override
    public Comment addComment(Comment comment) throws Exception {
        return commentManager.addComment(comment);
    }
}

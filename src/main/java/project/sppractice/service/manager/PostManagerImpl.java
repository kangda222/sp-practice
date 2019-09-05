package project.sppractice.service.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sppractice.domain.Board;
import project.sppractice.model.Post;
import project.sppractice.repository.PostRepository;

import java.util.Optional;

@Service
public class PostManagerImpl implements PostManager,BoardManager {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post addPost(Post post) throws Exception {
        return postRepository.save(post);
    }

    @Override
    public Board update(Board board) throws Exception {
        Optional<Post> prePost = postRepository.findById(board.getId());
        Post updatedPost = prePost.get();
        updatedPost.setTitle(board.getTitle());
        updatedPost.setContents(board.getContents());
        updatedPost = postRepository.save(updatedPost);
        board.setId(updatedPost.getId());
        board.setTitle(updatedPost.getTitle());
        board.setContents(updatedPost.getContents());
        return board;
    }

    @Override
    public String getType(){
        return "post";
    }
}

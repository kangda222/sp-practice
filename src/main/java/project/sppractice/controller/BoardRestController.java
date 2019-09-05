package project.sppractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import project.sppractice.domain.Board;
import project.sppractice.model.Post;
import project.sppractice.service.BoardService;

@RestController
@RequestMapping("board/*")
public class BoardRestController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "addPost", method = RequestMethod.POST)
    public Post addPost(@RequestBody Post post) throws Exception{
        System.out.println("BoardRestController ============addPost================");
        return boardService.addPost(post);
    }

    @RequestMapping(value = "updatePost", method = RequestMethod.POST)
    public Board updatePost(@RequestBody Board board) throws Exception{
        System.out.println("BoardRestController ============updatePost================");
        return boardService.updateBoard(board);
    }
}

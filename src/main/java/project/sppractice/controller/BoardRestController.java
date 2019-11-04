package project.sppractice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api("게시판 REST API")
public class BoardRestController {

    @Autowired
    BoardService boardService;

    @ApiOperation(value = "게시글 등록")
    @RequestMapping(value = "addPost", method = RequestMethod.POST)
    public Post addPost(@RequestBody @ApiParam(value = "게시글 객체") Post post) throws Exception{
        System.out.println("BoardRestController ============addPost================");
        return boardService.addPost(post);
    }

    @ApiOperation(value = "게시글 수정")
    @RequestMapping(value = "updatePost", method = RequestMethod.POST)
    public Board updatePost(@RequestBody Board board) throws Exception{
        System.out.println("BoardRestController ============updatePost================");
        return boardService.updateBoard(board);
    }
}

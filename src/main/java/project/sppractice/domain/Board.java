package project.sppractice.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "Board DTO : 게시판 내용", description = "게시판 내용")
@Data
public class Board {

    @ApiModelProperty(value = "게시글 번호")
    private long id;

    @ApiModelProperty(value = "게시글 제목")
    private String title;

    @ApiModelProperty(value = "게시글 내용")
    private String contents;

    @ApiModelProperty(value = "게시글 타입 / 게시글 or 댓글")
    private String type;
}

package project.sppractice.domain;

import lombok.Data;

@Data
public class Board {

    private long id;
    private String title;
    private String contents;
    private String type;
}

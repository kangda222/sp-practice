package project.sppractice.service.manager;

import project.sppractice.domain.Board;

public interface BoardManager {
    public String getType();

    public Board update(Board board) throws Exception;
}

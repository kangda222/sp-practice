package project.sppractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.sppractice.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
}

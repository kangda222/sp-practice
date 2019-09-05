package project.sppractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.sppractice.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}

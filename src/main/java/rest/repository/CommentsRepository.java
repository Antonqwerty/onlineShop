package rest.repository;

import org.springframework.data.repository.CrudRepository;
import rest.dao.Comments;

public interface CommentsRepository extends CrudRepository<Comments, Integer> {

}

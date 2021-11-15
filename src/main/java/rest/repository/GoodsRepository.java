package rest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import rest.dao.Goods;

public interface GoodsRepository extends CrudRepository<Goods, Integer> {
    @Query("SELECT g FROM Goods g JOIN FETCH g.goodsCategoryList")
    Iterable<Goods> findAll();
}

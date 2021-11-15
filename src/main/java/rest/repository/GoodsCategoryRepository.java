package rest.repository;

import org.springframework.data.repository.CrudRepository;
import rest.dao.Goods;
import rest.dao.GoodsCategory;

import java.util.List;

public interface GoodsCategoryRepository extends CrudRepository<GoodsCategory, Integer> {
    Object findAllById(Integer id);

    List<GoodsCategory> findGoodsCategoryByGoodsIn(List<Goods> goods);

}

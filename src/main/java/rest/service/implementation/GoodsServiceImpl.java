package rest.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.dao.Goods;

import rest.dto.GoodsListWrapperDto;
import rest.repository.GoodsRepository;
import rest.service.GoodsService;

@Service("GoodsServiceRest")

public class GoodsServiceImpl implements GoodsService {
    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public GoodsListWrapperDto getAllGoods() {
        Iterable<Goods> goods = goodsRepository.findAll();

        GoodsListWrapperDto goodsListWrapperDto = new GoodsListWrapperDto();
        return goodsListWrapperDto;
    }

}

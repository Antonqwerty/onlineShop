package rest.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.dao.Goods;

import rest.dto.GoodsDto;
import rest.dto.GoodsListWrapperDto;
import rest.mapper.GoodsMapper;
import rest.repository.GoodsRepository;
import rest.service.GoodsService;

import java.util.ArrayList;
import java.util.List;

@Service("GoodsServiceRest")
public class GoodsServiceImpl implements GoodsService {
    private final GoodsRepository goodsRepository;
    private final GoodsMapper goodsMapper;

    @Autowired
    public GoodsServiceImpl(GoodsRepository goodsRepository, GoodsMapper goodsMapper) {
        this.goodsRepository = goodsRepository;
        this.goodsMapper = goodsMapper;
    }

    @Override
    public GoodsListWrapperDto getAllGoods(String category, String currency) {
        Iterable<Goods> goods = goodsRepository.findAll();
        List<GoodsDto> goodsDtoList = new ArrayList<>();
        for (Goods i : goods) {
            goodsDtoList.add(goodsMapper.goodsDaoToDto(i));
        }
        GoodsListWrapperDto goodsListWrapperDto = new GoodsListWrapperDto();
        goodsListWrapperDto.setGoods(goodsDtoList);
        return goodsListWrapperDto;
    }

}

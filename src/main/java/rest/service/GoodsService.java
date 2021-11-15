package rest.service;

import rest.dto.GoodsListWrapperDto;

public interface GoodsService {
    GoodsListWrapperDto getAllGoods(String category, String currency);
}

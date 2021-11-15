package rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.constant.Currency;
import rest.dao.Goods;
import rest.dto.GoodsListWrapperDto;
import rest.service.GoodsService;

@RestController
@Slf4j
@RequestMapping("/api/goods")
public class GoodsController {
    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping("/{category}/{currency}")
    public GoodsListWrapperDto getAllGoods(@PathVariable(name = "category") String category,
                                           @PathVariable(name = "currency") String currency) {

        log.info("get all goods by category");
        if (!Currency.currencyList.containsKey(currency)) {
            log.warn("There is no currency = {} in directory", currency);
            log.debug("Changing currency to RUB");
            currency = "Rub";
        }
        return goodsService.getAllGoods(category, currency);
    }
}



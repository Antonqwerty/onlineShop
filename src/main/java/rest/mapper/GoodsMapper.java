package rest.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import rest.dao.Goods;
import rest.dto.GoodsDto;

@Service
@Mapper(componentModel = "spring")
public interface GoodsMapper {
    GoodsDto goodsDaoToDto(Goods goods);

    Goods goodsDtoToDao(GoodsDto goodsDto);
}

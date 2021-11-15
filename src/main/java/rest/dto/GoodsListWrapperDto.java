package rest.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoodsListWrapperDto {
    private List<GoodsDto> goods;
}

package rest.dto;

import lombok.Data;

@Data
public class GoodsDto {
    private int id;
    private String name;
    private String description;
    private int count;
    private String goodsCategory;
}

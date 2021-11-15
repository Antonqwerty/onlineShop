package rest.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GOODS_CATEGORY")
@Getter
@Setter
@Data
public class GoodsCategory {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    @NotBlank
    @Size(max = 80, message = "Maximum is 80 characters long")
    private String name;

    @ManyToMany(mappedBy = "goodsCategoryList")
    private List<Goods> goods = new ArrayList<>();
}

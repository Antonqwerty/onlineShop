package rest.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GOODS")
@Getter
@Setter
@Data
public class Goods {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int Integer;

    @Column(name = "NAME")
    private String name;

    //TODO Ограничение в 255 значений
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "COUNT")
    private int count;

    @Column(name = "COST_RUB")
    private double costRub;

    @ManyToMany
    @JoinTable(name = "GOODS_CATEGORY",
            joinColumns = @JoinColumn(name = "GOODS_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "GOODS_CATEGORY_ID", referencedColumnName = "ID"))
    private List<GoodsCategory> goodsCategoryList = new ArrayList<>();
}

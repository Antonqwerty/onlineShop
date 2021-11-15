package rest.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
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
    private Integer id;

    @Column(name = "NAME")
    @Size(max = 80, message = "Maximum is 80 characters long")
    private String name;

    @Column(name = "DESCRIPTION")
    @Size(max = 255, message = "Maximum is 255 characters long")
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

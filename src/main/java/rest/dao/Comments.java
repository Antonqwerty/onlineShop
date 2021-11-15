package rest.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMMENTS")
@Getter
@Setter
@Data
public class Comments {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "USER_NAME")
    @Size(max = 80, message = "Maximum is 80 characters long")
    private String userName;

    @Column(name = "USER_COMMENT")
    @Size(max = 255, message = "Maximum is 80 characters long")
    private String userComment;

    @Column(name = "USER_ESTIMATION")
    @Size(min = 0, max = 5, message = "0 to 5")
    private Integer userEstimation;

    @OneToMany(mappedBy = "comment")
    private List<Goods> goods = new ArrayList<>();
}

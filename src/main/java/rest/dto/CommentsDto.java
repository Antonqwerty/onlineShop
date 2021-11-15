package rest.dto;

import lombok.Data;

@Data
public class CommentsDto {
    private Integer id;
    private String userName;
    private String userComment;
    private Integer userEstimation;
}

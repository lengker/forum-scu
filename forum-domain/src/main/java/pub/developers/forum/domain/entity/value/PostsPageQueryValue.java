package pub.developers.forum.domain.entity.value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostsPageQueryValue implements Serializable {

    private String category;

    private List<String> auditStates;

    private Long typeId;

    private Long authorId;

    private String title;

    private Boolean official;

    private Boolean top;

    private Boolean marrow;

    private String markdownContent;

    /**
     * 1 => 未解决
     * 2 => 已解决
     */
    private Long commentId;

}

package pub.developers.forum.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 13
 * @create 2025.7
 * @desc 帖子评论
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseEntity {

    /**
     * 评论人ID
     */
    private Long userId;

    /**
     * 二次评论人ID
     */
    private Long replyId;

    /**
     * 二次评论人ID
     */
    private Long replyReplyId;

    /**
     * 帖子ID
     */
    private Long postsId;

    /**
     * 内容
     */
    private String content;

}

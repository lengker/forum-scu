package pub.developers.forum.domain.repository;

import pub.developers.forum.domain.entity.BasePosts;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface PostsRepository {

    BasePosts get(Long id);

    List<BasePosts> queryInIds(Set<Long> postsIds);

    List<Long> getAllIdByAuthorId(Long authorId);

    void increaseComments(Long id, Date updateAt);

    void decreaseComments(Long id, Date updateAt);

    void increaseViews(Long id, Date updateAt);

    void increaseApproval(Long id, Date updateAt);

    void decreaseApproval(Long id, Date updateAt);

    void delete(Long id);

    void update(BasePosts basePosts);
}

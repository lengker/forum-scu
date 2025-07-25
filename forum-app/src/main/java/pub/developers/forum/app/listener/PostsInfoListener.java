package pub.developers.forum.app.listener;

import org.springframework.stereotype.Component;
import pub.developers.forum.common.support.EventBus;
import pub.developers.forum.domain.entity.BasePosts;
import pub.developers.forum.domain.repository.PostsRepository;

import javax.annotation.Resource;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Component
public class PostsInfoListener extends EventBus.EventHandler<BasePosts> {

    @Resource
    private PostsRepository postsRepository;

    @Override
    public EventBus.Topic topic() {
        return EventBus.Topic.POSTS_INFO;
    }

    @Override
    public void onMessage(BasePosts posts) {
        postsRepository.increaseViews(posts.getId(), posts.getUpdateAt());
    }
}

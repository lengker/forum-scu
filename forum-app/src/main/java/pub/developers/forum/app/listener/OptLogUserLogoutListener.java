package pub.developers.forum.app.listener;

import org.springframework.stereotype.Component;
import pub.developers.forum.common.support.EventBus;
import pub.developers.forum.domain.entity.OptLog;
import pub.developers.forum.domain.repository.OptLogRepository;

import javax.annotation.Resource;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
@Component
public class OptLogUserLogoutListener extends EventBus.EventHandler<OptLog> {

    @Resource
    private OptLogRepository optLogRepository;

    @Override
    public EventBus.Topic topic() {
        return EventBus.Topic.USER_LOGOUT;
    }

    @Override
    public void onMessage(OptLog optLog) {
        optLogRepository.save(optLog);
    }
}

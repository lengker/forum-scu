package pub.developers.forum.domain.repository;

import pub.developers.forum.common.model.PageResult;
import pub.developers.forum.domain.entity.Faq;
import pub.developers.forum.domain.entity.value.PostsPageQueryValue;

import java.util.List;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public interface FaqRepository {

    void save(Faq faq);

    void update(Faq faq);

    void updateEntity(Faq faq);

    Faq get(Long id);

    PageResult<Faq> page(Integer pageNo, Integer pageSize, PostsPageQueryValue pageQueryValue);

    List<Faq> hots(int size);

}

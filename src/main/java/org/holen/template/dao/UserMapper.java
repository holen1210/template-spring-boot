package org.holen.template.dao;

import org.holen.template.domain.entity.UserDO;

import java.util.List;

/**
 * @author lvhaolin
 * @date 2019/01/06
 */
public interface UserMapper {
    UserDO selectById(Long id);

    List<UserDO> selectAll();
}

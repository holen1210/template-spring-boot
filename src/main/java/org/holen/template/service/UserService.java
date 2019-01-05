package org.holen.template.service;

import com.github.pagehelper.PageHelper;
import org.holen.template.dao.UserMapper;
import org.holen.template.domain.entity.UserDO;
import org.holen.template.domain.req.user.UserQueryReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lvhaolin
 * @date 2019/01/06
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public Object getUserById(Long id) {
        return userMapper.selectById(id);
    }

    public Object listUser(UserQueryReq req) {

        PageHelper.startPage(req);
        List<UserDO> userDOList = userMapper.selectAll();

        return userMapper.selectAll();
    }
}

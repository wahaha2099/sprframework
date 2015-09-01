package com.hoki.spring.user.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hoki.spring.user.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Hoki.
 * Date:2015/3/13 0013
 * Time:下午 1:09
 */
@Repository(value="userMapper")
public interface UserMapper {

    public List<User> getAllUser(PageBounds pageBounds);


}

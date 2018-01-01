package top.zyathome.www.dao;

import top.zyathome.www.entity.userEntity;

public interface userDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(userEntity record);

    int insertSelective(userEntity record);

    userEntity selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(userEntity record);

    int updateByPrimaryKey(userEntity record);
}
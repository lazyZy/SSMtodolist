package top.zyathome.www.dao;

public interface userDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(top.zyathome.www.entity.userEntity record);

    int insertSelective(top.zyathome.www.entity.userEntity record);

    top.zyathome.www.entity.userEntity selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(top.zyathome.www.entity.userEntity record);

    int updateByPrimaryKey(top.zyathome.www.entity.userEntity record);
}
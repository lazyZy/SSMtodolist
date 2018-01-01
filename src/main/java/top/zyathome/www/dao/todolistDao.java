package top.zyathome.www.dao;

import org.apache.ibatis.annotations.Param;
import top.zyathome.www.entity.todolistEntity;

public interface todolistDao {
    int insert(todolistEntity record);

    int insertSelective(todolistEntity record);

    int updateByExampleSelective(@Param("record") todolistEntity record, @Param("example") todolistEntity example);

    int updateByExample(@Param("record") todolistEntity record, @Param("example") todolistEntity example);
}
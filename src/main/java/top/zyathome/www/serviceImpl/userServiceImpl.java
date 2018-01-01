package top.zyathome.www.serviceImpl;

import org.springframework.stereotype.Service;
import top.zyathome.www.dao.userDao;
import top.zyathome.www.entity.userEntity;
import top.zyathome.www.service.userService;

import javax.annotation.Resource;

/**
 * Created by ZY on 2018/1/1.
 */
@Service("userService")
public class userServiceImpl implements userService {
    @Resource
    private userDao userdao;
    @Override
    public userEntity getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userdao.selectByPrimaryKey(userId);
    }

}
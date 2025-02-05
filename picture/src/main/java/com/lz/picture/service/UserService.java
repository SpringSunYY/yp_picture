package com.lz.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lz.picture.model.dto.user.UserQueryRequest;
import com.lz.picture.model.entry.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lz.picture.model.vo.user.LoginUserVO;
import com.lz.picture.model.vo.user.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author YY
 * Description 针对表【user(用户)】的数据库操作Service
 * createDate 2025-02-02 21:17:26
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * description: 加密方法
     * author: YY
     * method: getEncryptPassword
     * date: 2025/2/2 21:35
     * param:
     * param: userPassword
     * return: java.lang.String
     **/
    public String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * description: 获取到用户登录脱敏后的信息
     * author: YY
     * method: getLoginUserVO
     * date: 2025/2/2 21:52
     * param:
     * param: user
     * return: com.lz.picture.model.vo.user.LoginUserVO
     **/
    LoginUserVO getLoginUserVO(User user);

    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);
}

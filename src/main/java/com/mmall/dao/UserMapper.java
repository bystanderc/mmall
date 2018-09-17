package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DAO
 */
public interface UserMapper {
    /**
     * 通过id删除用户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加用户
     * @param record
     * @return
     */
    int insert(User record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 通过id更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新用户
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 查询用户名是否存在
     * @param username
     * @return
     */
    int checkUserName(String username);

    /**
     * 验证Email
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 通过用户名和密码验证登录
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password")String password);

    /**
     * 通过姓名查找找回密码的问题
     * @param username
     * @return
     */
    String selectQuestionByUsername(String username);

    /**
     * 验证回答的正确性
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * 通过姓名更新密码
     * @param username
     * @param newPassword
     * @return
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("newPassword") String newPassword);

    /**
     * 验证密码
     * @param password
     * @param userId
     * @return
     */
    int checkPassword(@Param("password") String password, @Param("userId") Integer userId);

    /**
     * 验证用户的email
     * @param email
     * @param userId
     * @return
     */
    int checkEmailByUserId(@Param("email") String email, @Param("userId") Integer userId);

}
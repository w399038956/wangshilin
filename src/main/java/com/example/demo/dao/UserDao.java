package com.example.demo.dao;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author wangShiLin
 * @date
 */
@Mapper
public interface UserDao {
//    @Insert("insert into a_user(id, login_name,real_name) values(#{id}, #{loginName},#{realName})")
    int add(@Param("id") String id, @Param("loginName") String loginName, @Param("realName") String realName);

//    @Update("update a_user set id = #{id}, login_name = #{loginName} where id = #{id}")
    int update(@Param("id") String id, @Param("loginName") String loginName);

//    @Delete("delete from a_user where id = #{id}")
    int delete(String id);

//    @Select("select id, login_name as loginName, real_name as realName, create_time as createTime from a_user where id = #{id}")
    UserBean findUserBean(@Param("id") String id);

//    @Select("select id, login_name as loginName, real_name as realName, phone, create_time as createTime from a_user")
    List <UserBean> findUserList();
}

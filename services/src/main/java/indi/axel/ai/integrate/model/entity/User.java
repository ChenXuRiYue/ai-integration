package indi.axel.ai.integrate.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
public class User extends BaseDO {

    @TableId(type = IdType.AUTO)
    /*
     id
    */
    private Integer id;

    /**
    * 用户名
    */
    private String name;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 用户邮箱
    */
    private String email;

    /**
    * 用户组织
    */
    private String organization;

    /**
    * 用户角色
    */
    private Integer role;


    /**
    * 用户账号
    */
    private String account;
}
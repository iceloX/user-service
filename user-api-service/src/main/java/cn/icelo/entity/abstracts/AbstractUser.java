package cn.icelo.entity.abstracts;

import cn.icelo.enums.EncryptType;
import cn.icelo.enums.UserStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author icelo
 * @date 2022/11/1 22:35
 * 设计成抽象类
 */
@Getter
@Setter
public abstract class AbstractUser {


    /**
     * 用户编号
     */
    private String id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码∑
     */
    private String password;

    /**
     * 加密类型
     */
    private EncryptType encryptType;
    /**
     * 盐值
     */
    private String saltValue;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 是否使用
     */
    private  Boolean enable;

    /**
     * 用户状态
     */
    private UserStatus userStatus;

    /**
     * 是否删除
     */
    private Boolean deleteUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

}

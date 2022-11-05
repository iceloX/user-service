package cn.icelo.enums;

/**
 * @author icelo
 * @date 2022/11/5 20:10
 */

/**
 * 用户密码的加密类型
 * @author icelo
 */
public enum EncryptType {

    /**
     * 默认使用md5加密
     */
    MD5,
    PBKDF2,
    BCRYPT,
    SCRYPT
}

package cn.icelo.entity;

import cn.icelo.entity.abstracts.AbstractUser;
import cn.icelo.enums.SystemType;
import lombok.Getter;
import lombok.Setter;


/**
 * @author icelo
 * @date 2022/11/5 20:27
 */
@Getter
@Setter
public class BaseUser extends AbstractUser {

    private SystemType systemType = SystemType.BASE;
}

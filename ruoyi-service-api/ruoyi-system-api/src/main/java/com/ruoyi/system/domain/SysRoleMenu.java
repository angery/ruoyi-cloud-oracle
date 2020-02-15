package com.ruoyi.system.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 角色和菜单关联 sys_role_menu
 * 
 * @author ruoyi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRoleMenu
{
    /** 角色ID */
    private String roleId;
    
    /** 菜单ID */
    private String menuId;
}

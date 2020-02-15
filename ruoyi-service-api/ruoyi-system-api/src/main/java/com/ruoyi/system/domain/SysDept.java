package com.ruoyi.system.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 部门表 sys_dept
 *
 * @author ruoyi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysDept extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 部门ID */
    private String              deptId;

    /** 父部门ID */
    private String              parentId;

    /** 祖级列表 */
    private String            ancestors;

    /** 部门名称 */
    private String            deptName;
    /** 部门编号 */
    private String            deptNo;
    /** 显示顺序 */
    private String            orderNum;

    /** 负责人 */
    private String            leader;

    /** 负责人编号 */
    private String            leaderId;

    /** 联系电话 */
    private String            phone;

    /** 邮箱 */
    private String            email;

    /** 部门状态:0正常,1停用 */
    private String            status;

    /** 删除标志（0代表存在 2代表删除） */
    private String            delFlag;

    /** 父部门名称 */
    private String            parentName;

}

package com.ruoyi.system.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 通知公告表 sys_notice
 * 
 * @author ruoyi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公告ID */
    private String noticeId;
    
    /** 公告标题 */
    private String noticeTitle;
    
    /** 公告类型（1通知 2公告） */
    private String noticeType;
    
    /** 公告内容 */
    private String noticeContent;
    
    /** 公告状态（0正常 1关闭） */
    private String status;


}

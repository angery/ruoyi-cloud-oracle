package com.ruoyi.system.controller;

import java.util.Set;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.service.ISysDeptService;

/**
 * 部门 提供者
 *
 * @author zmr
 * @date 2019-05-20
 */
@RestController
@RequestMapping("dept")
public class SysDeptController extends BaseController
{
    @Autowired
    private ISysDeptService sysDeptService;

    /**
     * 查询部门
     */
    @GetMapping("get/{deptId}")
    public SysDept get(@PathVariable("deptId") String deptId)
    {
        return sysDeptService.selectDeptById(deptId);
    }

    /**
     * 查询部门列表
     */
    @GetMapping("list")
    public R list(SysDept sysDept)
    {
        startPage();
        return result(sysDeptService.selectDeptList(sysDept));
    }

    /**
     * 新增保存部门
     */
    @PostMapping("save")
    public R addSave(@RequestBody SysDept sysDept)
    {
        if(StringUtils.isNotEmpty(sysDept.getPhone())&&!StringUtils.isPhone(sysDept.getPhone())){
            return R.error("请输入正确的手机号码");
        }
        if(StringUtils.isNotEmpty(sysDept.getEmail())&&!StringUtils.isEmail(sysDept.getEmail())) {
            return R.error("请输入正确的邮箱地址");
        }
        if (UserConstants.DEPT_NO_NOT_UNIQUE.equals(sysDeptService.checkDeptNameUnique(sysDept))) {
            return R.error("该部门名称已存在");
        }
        if (UserConstants.DEPT_NO_NOT_UNIQUE.equals(sysDeptService.checkDeptNoUnique(sysDept))) {
            return R.error("该部门编号已存在");
        }
        return toAjax(sysDeptService.insertDept(sysDept));
    }

    /**
     * 修改保存部门
     */
    @PostMapping("update")
    public R editSave(@RequestBody SysDept sysDept)
    {
        if(StringUtils.isNotEmpty(sysDept.getPhone())&&!StringUtils.isPhone(sysDept.getPhone())){
            return R.error("请输入正确的手机号码");
        }
        if(StringUtils.isNotEmpty(sysDept.getEmail())&&!StringUtils.isEmail(sysDept.getEmail())) {
            return R.error("请输入正确的邮箱地址");
        }
        if (UserConstants.DEPT_NO_NOT_UNIQUE.equals(sysDeptService.checkDeptNameUnique(sysDept))) {
            return R.error("该部门名称已存在");
        }
        if (UserConstants.DEPT_NO_NOT_UNIQUE.equals(sysDeptService.checkDeptNoUnique(sysDept))) {
            return R.error("该部门编号已存在");
        }
        return toAjax(sysDeptService.updateDept(sysDept));
    }

    /**
     * 删除部门
     */
    @PostMapping("remove/{deptId}")
    public R remove(@PathVariable("deptId") String deptId)
    {
        return toAjax(sysDeptService.deleteDeptById(deptId));
    }

    /**
     * 加载角色部门（数据权限）列表树
     */
    @GetMapping("/role/{roleId}")
    public Set<String> deptTreeData(@PathVariable("roleId" )String roleId)
    {
        if (null == roleId || "".equals(roleId)) return null;
        return sysDeptService.roleDeptIds(roleId);
    }
}

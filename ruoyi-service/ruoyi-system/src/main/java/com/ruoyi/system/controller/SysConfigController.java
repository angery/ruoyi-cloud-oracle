package com.ruoyi.system.controller;

import com.ruoyi.common.constant.UserConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.domain.SysConfig;
import com.ruoyi.system.service.ISysConfigService;

/**
 * 参数配置 提供者
 *
 * @author zmr
 * @date 2019-05-20
 */
@RestController
@RequestMapping("config")
public class SysConfigController extends BaseController
{

	@Autowired
	private ISysConfigService sysConfigService;

	/**
	 * 查询参数配置
	 */
	@GetMapping("get/{configId}")
	public SysConfig get(@PathVariable("configId") String configId)
	{
		return sysConfigService.selectConfigById(configId);

	}

	/**
	 * 查询参数配置列表
	 */
	@GetMapping("list")
	public R list(SysConfig sysConfig)
	{
		startPage();
        return result(sysConfigService.selectConfigList(sysConfig));
	}


	/**
	 * 新增保存参数配置
	 */
	@PostMapping("save")
	public R addSave(@RequestBody SysConfig sysConfig)
	{
		if (UserConstants.CONFIG_KEY_NOT_UNIQUE.equals(sysConfigService.checkConfigKeyUnique(sysConfig)))
		{
			return R.error("该参数健名已存在");
		}
		return toAjax(sysConfigService.insertConfig(sysConfig));
	}

	/**
	 * 修改保存参数配置
	 */
	@PostMapping("update")
	public R editSave(@RequestBody SysConfig sysConfig)
	{
		if (UserConstants.CONFIG_KEY_NOT_UNIQUE.equals(sysConfigService.checkConfigKeyUnique(sysConfig)))
		{
			return R.error("该参数健名已存在");
		}
		return toAjax(sysConfigService.updateConfig(sysConfig));
	}

	/**
	 * 删除参数配置
	 */
	@PostMapping("remove")
	public R remove(String ids)
	{
		return toAjax(sysConfigService.deleteConfigByIds(ids));
	}

}

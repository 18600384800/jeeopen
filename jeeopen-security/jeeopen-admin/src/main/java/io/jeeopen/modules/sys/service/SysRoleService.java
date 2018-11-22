package io.jeeopen.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import io.jeeopen.common.utils.PageUtils;
import io.jeeopen.modules.sys.entity.SysRoleEntity;

import java.util.Map;


/**
 * 角色
 * 
 * @author Alan
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}

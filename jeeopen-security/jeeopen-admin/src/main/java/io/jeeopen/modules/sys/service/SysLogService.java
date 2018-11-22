package io.jeeopen.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import io.jeeopen.common.utils.PageUtils;
import io.jeeopen.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 * 
 * @author Alan
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

package io.jeeopen.modules.oss.service;

import com.baomidou.mybatisplus.service.IService;
import io.jeeopen.common.utils.PageUtils;
import io.jeeopen.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 * 
 * @author Alan
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}

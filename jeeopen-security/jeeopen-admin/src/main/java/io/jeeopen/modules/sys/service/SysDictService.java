package io.jeeopen.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.jeeopen.common.utils.PageUtils;
import io.jeeopen.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 数据字典
 *
 * @author Alan
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package io.jeeopen.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import io.jeeopen.common.utils.PageUtils;
import io.jeeopen.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Alan
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}

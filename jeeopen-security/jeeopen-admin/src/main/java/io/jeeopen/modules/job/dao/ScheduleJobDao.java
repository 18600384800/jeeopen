package io.jeeopen.modules.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.jeeopen.modules.job.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Alan
 */
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}

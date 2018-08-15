package com.zc.common.locker.mapper;

import com.zc.common.core.locker.annotation.VersionLocker;
import com.zc.common.locker.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
	
	// 参数为POJO对象方式(推荐使用方式1)
	Integer updateUser(User user);
	
	// 参数为单个参数方式(推荐使用方式2)
	Integer updateUser(@Param("name") String name, @Param("password") String password, @Param("version") Long version, @Param("id") Integer id);
	
	// 参数为Map方式(不推荐使用方式，不够直观)
	Integer updateUser(Map<Object, Object> user);
	
	// 单个参数未带@Param，报错(严重不推荐使用方式)
	Integer updateUserError(String name, String password, Long version, Integer id);
	
	// 不参与乐观锁控制
	@VersionLocker(false)
	Integer updateUserNoVersionLocker(User user);

	// 重置数据库数据
	@VersionLocker(false)
	void resetData(User user);
}

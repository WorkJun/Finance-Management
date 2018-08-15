package com.zc.service.syxconfig;

import com.zc.common.core.result.Result;
import com.zc.common.core.utils.page.PageBean;
import com.zc.entity.syxconfig.SYXPayConfig;

import java.util.Map;

/**
 * @package : com.zc.service.syxconfig
 * @progect : Finance-Management
 * @Description :
 * @Author by :ZhaoJunBiao
 * @Creation Date ：2018年04月10日9:42
 */
public interface SyxPayConfigService {

    Map<String,Object> findSyxPayList(PageBean pageBean);

    Result addSyxPayConfig(SYXPayConfig syxPayConfig);

    Result updateSyxPayConfig(SYXPayConfig syxPayConfig);

    Result findSystemForm();
}

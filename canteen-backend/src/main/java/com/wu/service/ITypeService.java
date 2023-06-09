package com.wu.service;

import com.wu.entity.Type;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author NaHCO3
 * @since 2023-04-28
 */
public interface ITypeService extends IService<Type> {

    List<Type> findTypes(String name);
}

package com.wu.service;

import com.wu.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author NaHCO3
 * @since 2023-05-04
 */
public interface IDishService extends IService<Dish> {


    void setDishType(Integer dishId, List<Integer> typeIds);

    List<Integer> getDishType(Integer dishId);

}

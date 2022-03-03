package cn.happymaya.hamster.modules.ums.service;


import com.baomidou.mybatisplus.extension.service.IService;
import cn.happymaya.hamster.modules.ums.model.UmsResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理 Service
 * Created by superhsc on 2020/2/5.
 */
public interface IUmsResourceCategoryService extends IService<UmsResourceCategory> {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    boolean create(UmsResourceCategory umsResourceCategory);
}

package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;

/**
 * Created by gaoyoujian on 2019/7/28.
 */
public interface IProductService {

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

}

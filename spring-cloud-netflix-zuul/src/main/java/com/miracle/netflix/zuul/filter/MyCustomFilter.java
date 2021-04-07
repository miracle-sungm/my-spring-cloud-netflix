package com.miracle.netflix.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * 自定义过滤器
 *
 * @author : sungm
 * @date : 2021-04-07 15:48
 */
public class MyCustomFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}

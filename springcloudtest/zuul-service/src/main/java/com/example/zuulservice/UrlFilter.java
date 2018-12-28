package com.example.zuulservice;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求过滤
 * */
@Component
public class UrlFilter extends ZuulFilter {

    @Override
    public String filterType() {
        /**
         * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
         *
         * pre：路由之前
         * routing：路由之时
         * post： 路由之后
         * error：发送错误调用
         * */
        return "pre";
    }

    @Override
    public int filterOrder() {
        /**filterOrder：过滤的优先级，数字越大，优先级越低*/
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        System.out.println("当前请求的地址：" + request.getRequestURI());
        return null;
    }
}

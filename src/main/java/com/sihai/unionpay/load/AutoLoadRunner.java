package com.sihai.unionpay.load;

import com.sihai.unionpay.SDKConfig;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * AutoLoadRunner
 *
 * @author virgilin
 * @date 2018/11/19
 */

@Component
public class AutoLoadRunner extends HttpServlet {

    @Override
    public void init() throws ServletException {
        SDKConfig.getConfig().loadPropertiesFromSrc();
        super.init();
    }
}

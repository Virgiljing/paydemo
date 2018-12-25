package com.sihai.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UnionPayService {

    String pay(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException;
}

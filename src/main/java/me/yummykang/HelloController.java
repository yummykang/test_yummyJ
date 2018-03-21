package me.yummykang;

import me.yummykang.annotation.Controller;
import me.yummykang.annotation.Route;
import me.yummykang.constant.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * write something to describe this file.
 *
 * @author demon
 * @date 18-3-20 下午12:34
 */
@Controller
public class HelloController {

    @Route(value = "/hello", method = RequestMethod.GET)
    public Hello hello(Hello hello, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(request.getParameterMap());
        response.getWriter().write("helloooooooooooooooo");
        return hello;
    }
}

package tmall.filter;

import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BackServletFilter implements Filter {
    @Override
    public void destroy(){

    }

    @Override
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)
            throws IOException, ServletException{
        HttpServletResponse response = (HttpServletResponse)res;
        HttpServletRequest request = (HttpServletRequest)req;

        String contextPath = request.getServletContext().getContextPath();
        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri,contextPath);
        if(uri.startsWith("/admin_")){
            String servletPath = StringUtils.substringBetween(uri,"_","_");
            String method = StringUtils.substringAfterLast(uri,"+");
            request.setAttribute("method",method);

            req.getRequestDispatcher("/"+servletPath).forward(request,response);
            return;
        }
        chain.doFilter(request,response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException{

    }
}

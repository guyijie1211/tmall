package tmall.servlet;

import tmall.bean.Category;
import tmall.util.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class CategoryServlet extends BaseBackServlet {
    @Override
    public String list(HttpServletRequest request, HttpServletResponse response, Page page){
        List<Category> categories = categoryDAO.list(page.getStart(),page.getCount());
        int total = categoryDAO.getTotal();
        page.setTotal(total);

        request.setAttribute("thecs",categories);
        request.setAttribute("page",page);

        return "admin/listCategory.jsp";
    }

    public  String add(HttpServletRequest request, HttpServletResponse response, Page page){
        return "1";
    }
    public  String delete(HttpServletRequest request, HttpServletResponse response, Page page){
        return "1";
    }
    public  String edit(HttpServletRequest request, HttpServletResponse response, Page page){
        return "1";
    }
    public  String update(HttpServletRequest request, HttpServletResponse response, Page page){
        return "1";
    }

}

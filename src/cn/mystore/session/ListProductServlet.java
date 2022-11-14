package cn.mystore.session;

import java.io.*;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Collection<Product> products = ProductDB.getAll();
        out.write("本站提供的商品有：<br>");
        for (Product product : products) {
            String url = "/MyStore/PurchaseServlet?id=" + product.getId();
            HttpSession s=req.getSession();
            String newUrl=resp.encodeRedirectURL(url);
            out.write(product.getName() + "<a href='" + newUrl + "'>点击购买</a><br>");
        }
    }
}

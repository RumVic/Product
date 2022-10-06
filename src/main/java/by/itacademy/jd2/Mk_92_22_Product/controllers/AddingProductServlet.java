package by.itacademy.jd2.Mk_92_22_Product.controllers;

import by.itacademy.jd2.Mk_92_22_Product.storage.ProductStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AddingProductServlet", urlPatterns = "/add")
public class AddingProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IllegalArgumentException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        req.getRequestDispatcher("/WEB-INF/view/addProduct.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {



        String idAdd = req.getParameter("id");
        String nameAdd = req.getParameter("name");
        String priceAdd = req.getParameter("price");
        String saleAdd = req.getParameter("sale");
        String aboutAdd = req.getParameter("about");


        if(idAdd!=null && nameAdd!=null && priceAdd!=null && saleAdd!=null && aboutAdd!=null) {
         /*   if (idAdd.isBlank()) {
                throw new NumberFormatException("we hate white");
            }*/

            int i = Integer.parseInt(idAdd);
            int p = Integer.parseInt(priceAdd);
            int s = Integer.parseInt(saleAdd);

            ProductStorage.getInstance().add(i, nameAdd, p, s, aboutAdd);
            resp.sendRedirect(req.getContextPath()+"/get");
            //resp.sendRedirect("http://localhost:8080/Mk-JD2-92-22-Product-1.0-SNAPSHOT/get");

        }else throw new ServletException("GET method is not supported.");
    }
}

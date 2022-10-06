package by.itacademy.jd2.Mk_92_22_Product.controllers;

import by.itacademy.jd2.Mk_92_22_Product.core.ProductDTO;
import by.itacademy.jd2.Mk_92_22_Product.entity.ProductBuilder;
import by.itacademy.jd2.Mk_92_22_Product.service.ProductService;
import by.itacademy.jd2.Mk_92_22_Product.service.api.IProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AddingProductServlet", urlPatterns = "/add")
public class AddingProductServlet extends HttpServlet {

    IProductService service = ProductService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IllegalArgumentException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        req.getRequestDispatcher("/WEB-INF/view/addProduct.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {


        //String idAdd = req.getParameter("id");
        String nameAdd = req.getParameter("name");
        String priceAdd = req.getParameter("price");
        String saleAdd = req.getParameter("sale");
        String aboutAdd = req.getParameter("about");

        try {
            ProductDTO productDTO = new ProductDTO(nameAdd, Double.parseDouble(priceAdd), Double.parseDouble(saleAdd), aboutAdd);;
            service.validate(productDTO);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("fuck you from try/catch block");
        }



        resp.sendRedirect(req.getContextPath() + "/get");
        //ProductStorage.getInstance().add(i, nameAdd, p, s, aboutAdd);
        //resp.sendRedirect("http://localhost:8080/Mk-JD2-92-22-Product-1.0-SNAPSHOT/get");

    }
}

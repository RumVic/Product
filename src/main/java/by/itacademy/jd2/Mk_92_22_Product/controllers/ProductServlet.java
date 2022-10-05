package by.itacademy.jd2.Mk_92_22_Product.controllers;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;
import by.itacademy.jd2.Mk_92_22_Product.service.ProductService;
import by.itacademy.jd2.Mk_92_22_Product.service.api.IProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/get")
public class ProductServlet extends HttpServlet {
    private IProductService service = ProductService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        List<Product> products = service.get();
        req.setAttribute("products",products);

        req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req,resp);

    }
}

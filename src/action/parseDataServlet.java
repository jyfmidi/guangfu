package action;

import model.City;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/parseDataServlet")
public class parseDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        try {
            City city = utility.utility.getCityByName(n1, n2);

//            request.setAttribute("n", res);
            request.setAttribute("n1",n1);
            request.setAttribute("n2",n2);
            request.setAttribute("city",city);
            String url = "test.jsp";
            url = new String(url.getBytes("UTF-8"), "ISO8859-1");

            request.getRequestDispatcher(url).forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

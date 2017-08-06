package action;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import py.pyUtility;


@WebServlet("/parseDataServlet")
public class parseDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        String context =request.getServletContext().getRealPath("/");
        String res = "hello";
        res = pyUtility.pyTest(num1,num2,context);

        //int res =num1+num2;
        request.setAttribute("n", res);
        String url = "test.jsp";
        url = new String(url.getBytes("UTF-8"), "ISO8859-1");

        request.getRequestDispatcher(url).forward(request, response);
    }
}

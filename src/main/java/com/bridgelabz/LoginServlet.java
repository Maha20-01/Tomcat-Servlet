package com.bridgelabz;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if(user.equals("admin") && pass.equals("1234")) {

            RequestDispatcher rd =
                    request.getRequestDispatcher("LoginSuccess.jsp");

            rd.forward(request, response);
        }
        else {

            response.getWriter().println("Invalid Login");

        }
    }
}
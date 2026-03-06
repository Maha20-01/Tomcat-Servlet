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

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";

        if(!name.matches(nameRegex)) {

            response.getWriter().println("Invalid Name! Name must start with a capital letter and have minimum 3 characters.");
            return;
        }

        if(name.equals("Admin") && password.equals("1234")) {

            RequestDispatcher rd =
                    request.getRequestDispatcher("LoginSuccess.jsp");

            rd.forward(request, response);
        }
        else {

            response.getWriter().println("Invalid Login Credentials");

        }
    }
}
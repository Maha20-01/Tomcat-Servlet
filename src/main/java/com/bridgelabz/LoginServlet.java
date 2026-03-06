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
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$";

        if(!name.matches(nameRegex)) {
            response.getWriter().println("Invalid Name! Must start with capital letter and have minimum 3 characters.");
            return;
        }

        if(!password.matches(passwordRegex)) {
            response.getWriter().println("Invalid Password! Must contain 8 characters, 1 uppercase, 1 number and 1 special character.");
            return;
        }

        // If both validations pass
        response.getWriter().println("Login Successful! Welcome " + name);
    }
}
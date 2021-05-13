package com.example.opbd_lw_9.DB;

import com.example.opbd_lw_9.DB.DatabaseUtils;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/delete")
public class DeleteMaster extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            DatabaseUtils.deleteMaster(request.getParameter("id"));
            out.println("Deleted.");
        } catch (SQLException throwables) {
            out.println("Error.");
            throwables.printStackTrace();
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
package com.example.opbd_lw_9.DB;
import com.example.opbd_lw_9.Master;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/add")
public class AddMaster extends HttpServlet {
    private String message;

    public void init() {
        message = "Add!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            Master master = new Master(
                    0,
                    Integer.parseInt(request.getParameter("id_branch")),
                    Integer.parseInt(request.getParameter("sum_amount")),
                    request.getParameter("qualification"),
                    request.getParameter("master_number_passport"),
                    request.getParameter("full_name"),
                    Integer.parseInt(request.getParameter("exp")),
                    request.getParameter("insurance_number"),
                    request.getParameter("master_telephone"));
            DatabaseUtils.insertMaster(master);
            out.println("Added.");
        } catch (SQLException throwables) {
            out.println("Error add.");
            throwables.printStackTrace();
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

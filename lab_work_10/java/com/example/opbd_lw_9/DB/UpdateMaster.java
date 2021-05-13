package com.example.opbd_lw_9.DB;

import com.example.opbd_lw_9.Master;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/update")
public class UpdateMaster extends HttpServlet {
    private String message;

    public void init() {
        message = "Update!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            Master master = new Master(
                    Integer.parseInt(request.getParameter("id")),
                    Integer.parseInt(request.getParameter("id_branch")),
                    Integer.parseInt(request.getParameter("sum_amount")),
                    request.getParameter("qualification"),
                    request.getParameter("master_number_passport"),
                    request.getParameter("full_name"),
                    Integer.parseInt(request.getParameter("exp")),
                    request.getParameter("insurance_number"),
                    request.getParameter("master_telephone"));
            DatabaseUtils.updateMaster(master);
            out.println("Update.");
        } catch (SQLException throwables) {
            out.println("Error update.");
            throwables.printStackTrace();
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

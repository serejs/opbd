<%@ page import="com.example.opbd_lw_9.Master" %>
<%@ page import="static com.example.opbd_lw_9.DB.DatabaseUtils.getMasters" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Список мастеров</title>
</head>
<body>

<%
  try {
    for (Master master : getMasters()) {
      out.println(master + "");
      out.println("<a href='update.jsp?id="+ master.getMaster_personnel_number() +"'> Изменить</a> ");
      out.println("<a href='delete?id=" + master.getMaster_personnel_number() +"'> Удалить</a>");
    }
    out.println("<a href=\"add.jsp\">Добавить</a>");
  } catch (SQLException throwables) {
    throwables.printStackTrace();
  }
%>

</body>
</html>
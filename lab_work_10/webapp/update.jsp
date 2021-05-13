<%@ page import="com.example.opbd_lw_9.DB.DatabaseUtils" %>
<%@ page import="com.example.opbd_lw_9.Master" %>
<%@ page import="static com.example.opbd_lw_9.DB.DatabaseUtils.getMasters" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="static com.example.opbd_lw_9.DB.DatabaseUtils.getMaster" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление нового мастера</title>
</head>
<body>

<form method="post" action="update">
<%
    try {
        Master master = getMaster(request.getParameter("id"));
        out.print(
                "<input type=\"hidden\" name=\"id\" value=\""+ request.getParameter("id") + "\"/><br>"
        );
        out.print(
                "<input type=\"number\" name=\"id_branch\" value=\""+ master.getId_branch() + "\" placeholder=\"Id филиала, к которому принадлежит мастер\"/><br>"
        );
        out.print(
                "<input type=\"number\" name=\"sum_amount\" value=\""+ master.getSum_amount() + "\" placeholder=\"Сумма штрафов\"/><br>"
        );
        out.print(
                "<input type=\"text\" name=\"qualification\" value=\"" + master.getQualification() + "\" placeholder=\"Квалификация мастера\"/><br>"
        );
        out.print(
                "<input type=\"text\" name=\"master_number_passport\" value=\"" + master.getMaster_number_passport() + "\" placeholder=\"Номер паспорта\"/><br>"
        );
        out.print(
                "<input type=\"text\" name=\"full_name\" value=\"" + master.getFull_name() + "\" placeholder=\"ФИО\"/><br>"
        );
        out.print(
                "<input type=\"number\" name=\"exp\" value=\""+ master.getExp() +"\"placeholder=\"Опыт работы\"/><br>"
        );
        out.print(
                "<input type=\"text\" name=\"insurance_number\" value=\""+ master.getInsurance_number()+"\"placeholder=\"Страховой номер\"/><br>"
        );
        out.print(
                "<input type=\"text\" name=\"master_telephone\" value=\"" + master.getMaster_telephone() +"\"placeholder=\"Номер телефона\"/><br>"
        );

    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
%>
<input type="submit">
</form>

</body>
</html>

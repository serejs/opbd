<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление нового мастера</title>
</head>
<body>
<form method="post" action="add">
    <input type="number" name="id_branch" placeholder="Id филиала, к которому принадлежит мастер"/><br>
    <input type="number" name="sum_amount" placeholder="Сумма штрафов"/><br>
    <input type="text" name="qualification" placeholder="Квалификация мастера"/><br>
    <input type="text" name="master_number_passport" placeholder="Номер паспорта мастера"/><br>
    <input type="text" name="full_name" placeholder="ФИО"/><br>
    <input type="number" name="exp" placeholder="Опыт работы"/><br>
    <input type="text" name="insurance_number" placeholder="Страховой номер"/><br>
    <input type="text" name="master_telephone" placeholder="Номер телефона"/><br>
    <input type="submit">
</form>
</body>
</html>

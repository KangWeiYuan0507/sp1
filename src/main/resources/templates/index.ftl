<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <#list emps as emp>
        <tr>
            <td>${emp.eid}-</td>
            <td>${emp.ename}-</td>
            <td>${emp.salary}-</td>
            <td>${emp.hiredate}</td>
        </tr><br>
    </#list>
</body>
</html>
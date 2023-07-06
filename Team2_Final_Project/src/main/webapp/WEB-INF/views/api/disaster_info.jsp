<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="../../../resources/css/bootstrap.min.css" />
    <style>
      .wrapper #table_area {
        border: 1px solid midnightblue;
      }
    </style>
    <script src="../../../resources/js/jquery-3.3.1.min.js"></script>
    <script src="../../../resources/js/bootstrap.min.js"></script>
    <title>재난 발생 내역 조회</title>
  </head>
  <body>
    <div id="result_area"></div>
    <script>
      $(function () {
        load();
      });

      function load() {
        $.ajax({
          url: "/api/disaster_info",
          type: "GET",
          contentType: "application/json; charset=UTF-8;",
          dataType: "json",
          success: function (data) {
            alert("Success!");
            console.log(data);
            console.log(data);
          },
          error: function (e) {
            alert("Failed!");
            console.log(e);
            console.log(e);
          },
        });
      }
    </script>
  </body>
</html>

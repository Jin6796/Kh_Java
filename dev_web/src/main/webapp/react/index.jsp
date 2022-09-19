<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
      .title {
        color : red;
      }
    </style>
</head>
<body>
    <script
      crossorigin
      src="https://unpkg.com/react@17/umd/react.development.js"
    ></script>
    <script
      crossorigin
      src="https://unpkg.com/react-dom@17/umd/react-dom.development.js"
    ></script>
    <script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
    <div id="root"></div>
    <script type="text/babel">
      const root = document.getElementById("root");
      const msg = (
        <div
          className ="box"
          children = {[
            React.createElement("h1", null, "One"),
            React.createElement("h2", null, "Two"),
            React.createElement("h3", null, "Three"),
          ]}
        />
      );
      ReactDOM.render(msg, root);
    </script>
</body>
</html>
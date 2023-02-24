<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Background Image with Form</title>
    <style>
      body {
        background-image: url('RESIZED.png');
        background-size:cover;
        background-repeat:no-repeat;
        background-position:center -75px;
        min-height: 100vh;
        width:  100vw;
      }
.menu-container {
  position: fixed;
  top: 0;
  left: 0;
}

.menu-icon {
  display: block;
  width: 30px;
  height: 20px;
  cursor: pointer;
}

.menu-icon span {
  display: block;
  height: 3px;
  margin: 5px 0;
  background-color: red;
}

.menu {
  position: fixed;
  top: 0;
  left: -20%;
  width: 20%;
  height: 50%;
  background-color: #f3f11c;
  transition: left 0.5s;
}

.menu.open {
  left: 0;
}

.menu ul {
  list-style: circle;
  padding: 0;
  margin: 50px 0 0 0;
}

.menu li {
  padding: 10px;
  border-bottom: 1px solid #ccc;
}

.menu li:last-child {
  border-bottom: none;
}

.menu a {
  text-decoration:none;
  color: black;
}

.menu a:hover {
  color: black;
}
  </style>
  </head>
  <body>
<div class="menu-container">
  <div class="menu-icon">
    <span></span>
    <span></span>
    <span></span>
  </div>
  <div class="menu">
    <ul>
      <li><a href="home.jsp">Home</a></li>
      <li><a href="Login.html">Consumer-Login</a></li>
      <li><a href="Cab-reg.html">Cab-Registration</a></li>
    </ul>
  </div>
</div>

 <script>
    var menuIcon = document.querySelector('.menu-icon');
    var menu = document.querySelector('.menu');

      menuIcon.addEventListener('mouseenter', function() {
      menu.classList.toggle('open');
    });

      menu.addEventListener('mouseleave', function() {
      menu.classList.toggle('open');
    });
  </script>
  </body>
</html>
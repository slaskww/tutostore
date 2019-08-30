<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<c:url  var="register" value="/"/>
<c:url  var="login" value="/"/>
<c:url  var="logout" value="/"/>
<c:url  var="userPanel" value="/"/>
<c:url  var="courses" value="/"/>
<c:url  var="discount" value="/"/>
<c:url  var="about" value="/"/>

<img src="img/logo_header.png" class="img-fluid" alt="Responsive image">
<header>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #a2b2c7">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="${register}">register<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${login}">login<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${logout}">logout<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${userPanel}">user panel<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${courses}">courses<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${discount}">discount<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${about}">about<span class="sr-only">(current)</span></a>
                </li>
            </ul>
        </div>
    </nav>
</header>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <h2 class="h3 mb-3 font-weight-normal text-center">Registration form:</h2>
    <form:form method="POST"
               action="/create" modelAttribute="user">
        <form:input class="form-control" path="id" hidden="true"/>
        <form:input class="form-control" type="number" path="balance" hidden="true"/>

        <div class="form-group col-md-2 offset-md-5 p-0 mb-1 bg-light text-dark" >
            <form:label class="sr-only" path="username">Username</form:label>
            <form:input class="form-control" path="username" required="true"/>
        </div>
        <div class="form-group col-md-2 offset-md-5 p-0 mb-1 bg-light text-dark">
            <form:label class="sr-only" path="password">Password</form:label>
            <form:password class="form-control" path="password" required="true"/>
        </div>
        <div class="form-group col-md-2 offset-md-5 p-0 mb-1 bg-light text-dark">
            <form:label class="sr-only" path="email">Email</form:label>
            <form:input class="form-control" type="email" path="email" required="true"/>
        </div>
        <form:button class="btn btn-primary col-md-2 offset-md-5" type="submit" value="Submit">Submit</form:button>
    </form:form>



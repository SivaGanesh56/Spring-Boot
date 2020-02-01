<html>
<head>
<title>Update ToDo</title>
</head>
<body>
<div class ="container">
	<form method="post">
	    <h2 style="color:gray;"><b>Description</b></h2>
            <input type="text" name="desc" value="${todo.desc}"
            style="width:96%;height:90px;background-color:lightgray;color:olive;border:none;
            padding:2%;font:22px/30px sans-serif;">

            <input type ="text" name="id" value="${todo.count}" style="width:96%;height:0%;background-color:lightgray;color:lightgray;border:none
            padding:2%;font:22px/30px sans-serif;">
    <br> <br>
    <input type="submit" value="Update"
     style="background-color:yellowgreen;color:white;padding:5px;font-size:18px;border:none;padding:8px;">

    </form>


		<script src="webjars/bootstrap/4.4.1/bootstrap-4.4.1.jar!/META-INF/resources/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
         <script src="webjars/bootstrap/4.4.1/bootstrap-4.4.1.jar!/META-INF/resources/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</div>
</body>
</html>
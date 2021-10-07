<?PHP
	require_once('./configure.php');

	$Username = $_POST['Username'];
	$Password = $_POST['Password'];
	if(!empty($Username) && !empty($Password)){
	$SELECT = "SELECT Username, Password FROM tbl_signup WHERE tbl_signup.Password='$Password'";
		mysqli_query($conn,$SELECT);
	
		
		echo "I *think* you logged in idk<br/>";
	
	}
	else{
		echo "An error constructing SELECT statement.";
		
	}

     
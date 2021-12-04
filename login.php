<?PHP
session_start();
	require_once('./configure.php');
	
	$Username = $_POST['Username'];
	$Password = $_POST['Password'];
	$Email=$_POST['Email'];
	
	$SELECT = mysqli_query($conn,"SELECT * FROM tbl_signup WHERE Password='$Password' AND Username='$Username' OR Email='$Email'");
	$row  = mysqli_fetch_array($SELECT);
    if(is_array($row))
    {
        $_SESSION["Username"] = $row['Username'];
        $_SESSION["Password"]=$row['Password'];
		$_SESSION["Email"]=$row['Email'];
		
	
		echo $_SESSION['Username'];
		echo "I *think* you logged in idk<br/>";
		echo "<form action='./home.html' method='get'><input type='submit' value='Go to Home Page'/></form>";
	
	}
	else{
		echo "Could not login, try again.";
		
	}
	

     ?>
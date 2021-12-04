<?PHP
session_start();
require_once('./configure.php');
require_once('./login.php');
$Username = $_POST['Username'];
$Email=$_POST['Email'];

    $SELECT = mysqli_query($conn,"SELECT * FROM tbl_signup");
    $row  = mysqli_fetch_array($SELECT);
	echo $_SESSION['Username'];
    echo $_SESSION['Email'];
    
?>
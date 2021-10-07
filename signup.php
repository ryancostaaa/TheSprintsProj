<?php

require_once('./configure.php');


$Name = $_POST['Name'];
$Username = $_POST['Username'];
$Email = $_POST['Email'];
$Password = $_POST['Password'];

if(!empty($Name) && !empty($Username)  && !empty($Email)  && !empty($Password)){
    $sql = "INSERT INTO tbl_signup (Name, Username, Email, Password) VALUES ('$Name', '$Username', '$Email', '$Password')";
    
    mysqli_query($conn,$sql);
   

        
    echo "New record inserted successfully";
    echo "<form action='./login.html' method='get'><input type='submit' value='Go Back to Login Page'/></form>";
}



    
    else {
        echo "Failure to Insert record.";
        echo "<form action='./login.html' method='get'><input type='submit' value='Go Back to Login Page'/></form>";
    }






    mysqli_close($conn);
?>
    



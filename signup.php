<?php

require_once('./configure.php');


$Name = $_POST['Name'];
$Username = $_POST['Username'];
$Email = $_POST['Email'];
$confEmail=$_POST['ConfirmEmail'];
$Password = $_POST['Password'];
$confPassword=$_POST['ConfirmPassword'];


if(!empty($Name) && !empty($Username)  && !empty($Email)  && !empty($Password)){
    if($_POST['ConfirmPassword']!== $_POST['Password']){
        echo "passwords dont match ";
        echo "<form action='./login.html' method='get'><input type='submit' value='Go Back to Login Page'/></form>";
        clean_all_processes();
    }
    
    elseif($_POST['ConfirmEmail'] !== $_POST['Email']){
        echo "emails dont match ";
        echo "<form action='./login.html' method='get'><input type='submit' value='Go Back to Login Page'/></form>";
        clean_all_processes();
    }
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
    



<?PHP
    define('DB_SERVER', '127.0.0.1');
    define('DB_USER', 'root');
    define('DB_PASSWORD', 'rootdb');
    define('DB_DATABASE', '490frontend');
	
    $conn = new mysqli(DB_SERVER, DB_USER, DB_PASSWORD, DB_DATABASE);
	
    if(mysqli_connect_error()){
        echo DB_DATABASE . " Database connection failed.<br>";
        die('Connect Error('.mysqli_connect_errno().')'. mysqli_connect_error());
    }
    else{
        echo DB_DATABASE . " Database connection successful!<br>";
    }
?>
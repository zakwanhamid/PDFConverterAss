<?php
$target_dir = "/var/www/html/upload/";
$target_file = $target_dir . basename($_FILES["file"]["name"]);
$name = explode(".", basename( $_FILES["file"]["name"]));
$filename = $name[0];
if (move_uploaded_file($_FILES["file"]["tmp_name"], $target_file)) {

}
echo shell_exec('java -jar updateCAT.jar "'.$filename.'"');

$dir = "/converted/Test_Convert.txt";
echo "<a href= '$dir' download>Click here</a>";



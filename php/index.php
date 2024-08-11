<?php
$mininumbers = array(1, 2, 3, 4);
foreach ($mininumbers as &$valor) {
    $valor = $valor * 2;
}
unset($valor); 
?>
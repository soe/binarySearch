<?php

function binarySearch($haystack, $needle, $startIndex, $endIndex) {
  while ($startIndex <= $endIndex) {
    $midIndex = floor(($startIndex + $endIndex) / 2);

    // found!
    if ($haystack[$midIndex] == $needle)
      return $midIndex;

    // take higher right half
    if ($haystack[$midIndex] < $needle)
      $startIndex = $midIndex + 1;

    // take lower left half
    else
      $endIndex = $midIndex - 1;
  }

  // not found!
  return FALSE;
}


// try the function
$haystack = array(1, 3, 5, 11, 23, 33, 51);
$needle = 11;
$result = binarySearch($haystack, $needle, 0, count($haystack) - 1);

if ($result) echo "Needle is found at index ", $result;
else echo "Needle is not in the haystack";

?>
function binarySearch(haystack, needle, startIndex, endIndex) {
  let midIndex;

  if (startIndex <= endIndex) {
    midIndex = Math.floor((startIndex + endIndex) / 2);

    // found!
    if (haystack[midIndex] == needle)
      return midIndex;

    // take higher right half
    if (haystack[midIndex] < needle)
      return binarySearch(haystack, needle, midIndex + 1, endIndex);

    // take lower left half
    else
      return binarySearch(haystack, needle, startIndex, midIndex - 1);
  } 

  // not found!
  return false;
}


// try the function
haystack = new Array(1, 3, 5, 11, 23, 33, 51);
needle = 11;
result = binarySearch(haystack, needle, 0, haystack.length - 1);

if (result) console.log("Needle is found at index " + result);
else console.log("Needle is not in the haystack");
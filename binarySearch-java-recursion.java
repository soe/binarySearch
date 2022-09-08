class BinarySearchRecursion {

  int binarySearch(int haystack[], int needle, int startIndex, int endIndex) {
    if (startIndex <= endIndex) {
      int midIndex = (int) Math.floor((startIndex + endIndex) / 2);

      // found!
      if (haystack[midIndex] == needle)
        return midIndex;

      // take higher right half
      if (haystack[midIndex] < needle)
        return binarySearch(haystack, needle, midIndex + 1, endIndex);

      // take lower left half
      return binarySearch(haystack, needle, startIndex, midIndex - 1);
    }

    // not found!
    return -1;
  }

  // try the method
  public static void main(String args[]) {
    BinarySearchRecursion search = new BinarySearchRecursion();
    int haystack[] = { 1, 3, 5, 11, 23, 33, 51 };
    int needle = 11;
    int result = search.binarySearch(haystack, needle, 0, haystack.length - 1);
    if (result == -1)
      System.out.println("Needle is not in the haystack");
    else
      System.out.println("Needle is found at index "+ result);
          
  }
}
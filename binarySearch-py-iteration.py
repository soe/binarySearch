def binarySearch(haystack, needle, startIndex, endIndex):

	while startIndex <= endIndex:

		midIndex = (startIndex + endIndex) // 2

		# found!
		if haystack[midIndex] == needle:
			return midIndex

		# take higher right half
		elif haystack[midIndex] < needle:
			startIndex = midIndex + 1

		# take lower left half
		else:
			endIndex = midIndex - 1

	# not found!
	return False


# try the function
haystack = [1, 3, 5, 11, 23, 33, 51]
needle = 11

result = binarySearch(haystack, needle, 0, len(haystack) - 1)

if result:
	print("Needle is found at index % d" % result)
else:
	print("Needle is not in the haystack")
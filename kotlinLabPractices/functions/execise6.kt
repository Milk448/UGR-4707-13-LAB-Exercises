fun mergeSort(numbers: IntArray): IntArray {
    if (numbers.size <= 1) return numbers
  
    val middle = numbers.size / 2
    val left = mergeSort(numbers.sliceArray(0 until middle))
    val right = mergeSort(numbers.sliceArray(middle until numbers.size))
  
    return merge(left, right)
  }
  
  private fun merge(left: IntArray, right: IntArray): IntArray {
    val result = IntArray(left.size + right.size)
    var i = 0
    var j = 0
    var k = 0
  
    while (i < left.size && j < right.size) {
      if (left[i] < right[j]) {
        result[k] = left[i]
        i++
      } else {
        result[k] = right[j]
        j++
      }
      k++
    }
  
    while (i < left.size) {
      result[k] = left[i]
      i++
      k++
    }
  
    while (j < right.size) {
      result[k] = right[j]
      j++
      k++
    }
  
    return result
  }
  
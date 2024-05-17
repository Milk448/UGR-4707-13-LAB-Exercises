fun hasUniqueCharsRecursive(str: String): Boolean {
    if (str.length == 1) return true
    val firstChar = str[0]
    val remainingString = str.substring(1)
    if (remainingString.contains(firstChar)) {
      return false
    }
    return hasUniqueCharsRecursive(remainingString)
  }
  
tailrec fun factorial(n: Int): Long {
    if (n == 0) return 1L
    return n * factorial(n - 1)
  }
  
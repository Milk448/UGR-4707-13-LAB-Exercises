fun main() {
    val STANDARD_HOURS = 40.0  
    val OVERTIME_RATE = 1.5  
  
    println("Enter the number of hours worked: ")
    val hoursWorked = readLine()!!.toDouble()
  
    println("Enter the hourly rate: ")
    val hourlyRate = readLine()!!.toDouble()
  
    val totalPay: Double = if (hoursWorked > STANDARD_HOURS) {
      val regularPay = STANDARD_HOURS * hourlyRate
      val overtimeHours = hoursWorked - STANDARD_HOURS
      val overtimePay = overtimeHours * hourlyRate * OVERTIME_RATE
      regularPay + overtimePay
    } else {
      hoursWorked * hourlyRate
    }
  
    println("Total salary: $$totalPay")
  }
  
package com.equalexperts.fb

trait FizzBuzzService {
  type FizzBuzzResult = String
  type FizzBuzzResultWithReport = String

  def fizzBuzz(numbers: Range): FizzBuzzResult

  def fizzBuzzWithReport(numbers: Range): FizzBuzzResultWithReport

}

object FizzBuzzService {
  val fizz = "fizz"
  val buzz = "buzz"
  val fizzbuzz = "fizzbuzz"
  val lucky = "lucky"

  def apply(): FizzBuzzService = new DefaultFizzBuzzService

}

private[fb] class DefaultFizzBuzzService extends FizzBuzzService {

  import FizzBuzzService._

  override def fizzBuzz(numbers: Range) = {
    numbers.map(fizzBuzzConvert).mkString(" ")
  }

  private def fizzBuzzConvert(num: Int): String = {
    num match {
      case n if n.toString.contains("3") => lucky
      case n if n % 15 == 0 => fizzbuzz
      case n if n % 3 == 0 => fizz
      case n if n % 5 == 0 => buzz
      case _ => num.toString
    }
  }

  override def fizzBuzzWithReport(numbers: Range): String = {
    val result = fizzBuzz(numbers)
    val resultParts = result.split(" ").toSeq
    val (nums, nonNums) = resultParts.partition(_.forall(Character.isDigit))
    val nonNumsReport = nonNums.groupBy(k => k).map { case (k, v) => s"$k: ${v.size}" }
    val allReport = nonNumsReport.mkString(" ") + " integer: " + nums.size
    s"$result $allReport"
  }
}

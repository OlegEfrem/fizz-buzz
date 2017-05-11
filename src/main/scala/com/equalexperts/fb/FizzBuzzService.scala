package com.equalexperts.fb

trait FizzBuzzService {

  def fizzBuzz(numbers: Range): String

}

object FizzBuzzService {
  def apply(): FizzBuzzService = new FizzBuzzService {
    override def fizzBuzz(numbers: Range) = ""
  }
}

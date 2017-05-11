package com.equalexperts.fb

import org.scalatest.{ Matchers, WordSpec }

class FizzBuzzServiceTest extends WordSpec with Matchers {
  private val service = FizzBuzzService()
  import FizzBuzzService._

  "fizzBuzz" should {

    s"replace ‘fizz’ for numbers that are multiples of 3 except the ones containing a 3" in {
      service.fizzBuzz(6 to 6) shouldBe fizz
      service.fizzBuzz(3 to 3) shouldNot be(fizz)
    }

    "replace ‘buzz’ for numbers that are multiples of 5" in {
      service.fizzBuzz(5 to 5) shouldBe buzz
    }

    "replace ‘fizzbuzz’ for numbers that are multiples of 15" in {
      service.fizzBuzz(15 to 15) shouldBe fizzbuzz
    }

    val res1to20 = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
    s"produce the following result: $res1to20, for a range from 1-20" in {
      service.fizzBuzz(1 to 20) shouldBe res1to20
    }

    "replace ‘lucky’ for numbers that contain a three" in {
      service.fizzBuzz(3 to 3) shouldBe lucky
    }

  }

  "fizzBuzzWithReport" should {
    val res1to20withReport = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"
    s"return $res1to20withReport, for a range from 1-20" in {
      service.fizzBuzzWithReport(1 to 20) shouldBe res1to20withReport
    }

  }

}

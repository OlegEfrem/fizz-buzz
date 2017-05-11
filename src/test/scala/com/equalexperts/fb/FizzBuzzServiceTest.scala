package com.equalexperts.fb

import org.scalatest.{ Matchers, WordSpec }

class FizzBuzzServiceTest extends WordSpec with Matchers {
  private val service = FizzBuzzService()

  "fizzBuzz" should {

    "replace ‘fizz’ for numbers that are multiples of 3" in {
      service.fizzBuzz(3 to 3) shouldBe "fizz"
    }

    "replace ‘buzz’ for numbers that are multiples of 5" in {
      service.fizzBuzz(5 to 5) shouldBe "buzz"
    }

    "replace ‘fizzbuzz’ for numbers that are multiples of 15" in {
      service.fizzBuzz(15 to 15) shouldBe "buzz"
    }

    val res1to20 = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
    s"produce the following result: $res1to20, for a range from 1-20" in {
      service.fizzBuzz(1 to 20) shouldBe res1to20
    }

  }
}

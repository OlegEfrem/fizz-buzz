# Project and task details
* Task description is provided in the readme but also can be found [here](https://equalexperts.github.io/ee-fizzbuzz-marking/candidate-instructions)
* Version of the task is: d44d84d00450bb2591af4d151e70fc1bcc7796eb
* This is a scala sbt project, and was developed and tested to run with: Java 1.8, Scala 2.12.2 and Sbt 0.13.15
 
# Implementation highlights
Implemented solution kept close with the recommendations and namely:
* Test Coverage: The solution should be developed “test-first”, and should have excellent unit tests and test coverage.
  * The tests were created before the implementation in a pure TDD style, using [scala test](http://www.scalatest.org/) 
  * Test coverage enabled via [s-coverage](https://github.com/scoverage/sbt-scoverage) plugin, results of the test coverage are: 
  ```text
    [info] Statement coverage.: 100.00%
    [info] Branch coverage....: 100.00%
    [info] Coverage reports completed
    [info] 100% Coverage !
    ```
* Build file: Please provide an automated build file that compiles your code and runs the tests. Submissions without an automated build will not be accepted.
  * The project uses [SimpleBuildTool - sbt](http://www.scala-sbt.org/)
  * To clean the project use: ```sbt clean```, to compile use: ```sbt compile```, to test use: ```sbt test```, all three commands can be used together: ```sbt clean compile test```

* Simplicity: We value simplicity as an architectural virtue and a development practice. Solutions should reflect the difficulty of the assigned task, and should not be overly complex. Layers of abstraction, patterns, or architectural features that aren’t called for should not be included.
  * Solution uses only concepts needed for this simple task (for eg. scala pattern matching is used instead of Strategy Pattern or Higher Order Functions, which could be used for more complex requirements);
  * Just one layer of abstraction at the trait level with its trait companion object that encapsulates the implementation class:
    * this gives the flexibility to provide alternative implementations for the clients without affecting their code that would otherwise be bound to a specific implementation class;
  * Reporting implementation was intentionally done in a different method for a several reasons: 
    * to follow the extendability with backward compatibility principle so that potential clients won't have to change their existing code significantly;
    * to avoid changing all existing tests;
* Self-explanatory code: The solution you produce must speak for itself. Multiple paragraphs explaining the solution are a sign that it isn’t straightforward enough to understand purely by reading code, and are not appropriate.
  * The methods of the service are intention revealing where operation name, parameter, parameter type, and return type contribute to reveal the intention of the method;
  * This way there is no need to look into the implementation or other documentation;
  * At most a look into the tests would provide enough insight onto the operations' usage;
  * The method signature is: 
    ```text
      def fizzBuzz(numbers: Range): FizzBuzzResult
    
      def fizzBuzzWithReport(numbers: Range): FizzBuzzResultWithReport
      ```
    * The operation signature is almost human readable language saying: 
      * first operation is performing a fizz buzz logic on a range of numbers returning a fizz buzz result;
      * second operation is performing a fizz buzz logic with a report on a range of numbers returning a fizz buzz result with report;
  * There are type aliases used to increase the intention revealing of the operation: 
      ```text
      type FizzBuzzResult = String
      type FizzBuzzResultWithReport = String
       ```
       * the type alias is revealing the intention of String type in different contexts: one is the meaning of the string in the context of fizzBuzz operation, and different is the meaning in the context of fizzBuzzWithReport operation.
       * without type aliasing we would be left to create type/class wrappers or leave String type which might give the impression that both methods have the same result; 
* Coding style and formatting automatically checked with: 
  * [scala-style](http://www.scalastyle.org/) for code style checking and;
  * [scala-iform](https://github.com/scala-ide/scalariform) for code formatting;

# Task Description
* Please write code delivering the requirements of the steps that follow. 
* The requirements don’t mention a command line application, and we are not looking for one. 
* Do write code that you would be happy delivering to a paying client.
* You should not find this test to be particularly difficult. It is designed to be a straightforward coding exercise, and it should take you no more than 90 minutes.

## Step 1

Write a class that produces the following for any contiguous range of integers:
* ‘fizz’ for numbers that are multiples of 3
* ‘buzz’ for numbers that are multiples of 5
* ‘fizzbuzz’ for numbers that are multiples of 15
* Being careful to avoid trailing spaces.
* e.g: 
  * Running the program with a range from 1-20 should produce the following result:
  * 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz

## Step 2

Please enhance your existing FizzBuzz solution to perform the following:
* If the number contains a three you must output the text ‘lucky’. This overrides any existing behaviour
* e.g: 
  * Running the program with a range from 1-20 should produce the following result:
  * 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz


# Step 3

Finally, please enhance your existing solution to perform the following:
* Produce a report at the end of the output showing how many times the following were printed:
  * fizz
  * buzz
  * fizzbuzz
  * lucky
  * an integer
* e.g. 
  * Running the program with a range from 1-20 should produce the following result:
  * 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10
  * Integer is 10 because there were 10 numbers that were not altered


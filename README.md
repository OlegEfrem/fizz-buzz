# Requirements
* Are provided in the readme but also can be found [here](https://equalexperts.github.io/ee-fizzbuzz-marking/candidate-instructions)
* Version of the requirements is: d44d84d00450bb2591af4d151e70fc1bcc7796eb

# Real FizzBuzz
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


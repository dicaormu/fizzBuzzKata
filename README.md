# fizzBuzzKata
Unit tests for the fizz buzz kata

To install, from your command line, type:

```sh
git clone  https://github.com/dicaormu/fizzBuzzKata.git
```

The project is a gradle project, but if you don't have gradle in your system, i've included the gradle wrapper.

To generate the eclipse project, from your command line type:

```sh
gradlew eclipse
```

To build the project 

```sh
gradlew build
```

The project contains some failed tests. The idea is to solve the problem of fizz buzz and create the code to make the test pass.

# fizz buzz

For all the number in a list of consecutive numbers greater than zero return:

“fizz” if the number is dividable by 3.
“buzz” if the number is dividable by 5.
“fizzbuzz” if the number is dividable by 15.
The same number if no other requirement is fulfilled

# complex fizz buzz

the same rules of fizz buzz, but aditionally, if the number contains 3 or 5, return ##fizz## if it's a 3; ##buzz## if it's a 5
where ## are the numbers in the sides of the 3 or 5

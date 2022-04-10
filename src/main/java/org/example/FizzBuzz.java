package org.example;

public class FizzBuzz {
    public String process(int fizzBuzzNumber) {
        String answer = String.valueOf(fizzBuzzNumber);
        if (isDividableBy3(fizzBuzzNumber) && isDividableBy5(fizzBuzzNumber)){
            answer = "FizzBuzz";
        } else if (isDividableBy3(fizzBuzzNumber)){
            answer = "Fizz";
        }else if (isDividableBy5(fizzBuzzNumber)){
            answer = "Buzz";
        }
        return answer;
    }

    private boolean isDividableBy5(int fizzBuzzNumber) {
        return fizzBuzzNumber % 5 == 0;
    }

    private boolean isDividableBy3(int fizzBuzzNumber) {
        return fizzBuzzNumber % 3 == 0;
    }

}

package org.example;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

  @Test
  void stupidTest() {
    assertThat(1==1).isTrue();
  }

  @Test
  void runFizzBuzzClass(){

      FizzBuzz fizzBuzz = new FizzBuzz();
    assertThat(fizzBuzz).isNotNull();
  }

  @Test
  void fizzBuzzLeaves1AsNormalNumber(){

    FizzBuzz fizzBuzz = new FizzBuzz();
            fizzBuzz.process(1);
    assertThat(fizzBuzz.process(1)).isEqualTo("1");
  }

  @Test
  void fizzBuzzLeaves2AsNormalNumber(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.process(2);
    assertThat(fizzBuzz.process(2)).isEqualTo("2");
  }

  @Test
  void fizzBuzzLeaves3AsFizz(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.process(3);
    assertThat(fizzBuzz.process(3)).isEqualTo("Fizz");
  }

  @Test
  void fizzBuzzLeaves5AsBuzz(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.process(5);
    assertThat(fizzBuzz.process(5)).isEqualTo("Buzz");
  }

  @Test
  void fizzBuzzDividableByThree(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.process(9);
    assertThat(fizzBuzz.process(9)).isEqualTo("Fizz");
  }

  @Test
  void fizzBuzzDividableByFive(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.process(10);
    assertThat(fizzBuzz.process(10)).isEqualTo("Buzz");
  }

  @Test
  void fizzBuzzDividableByThreeAndFive(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.process(15);
    assertThat(fizzBuzz.process(15)).isEqualTo("FizzBuzz");
  }


}
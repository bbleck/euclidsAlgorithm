package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EuclidsAlgorithmTest {

  @Test
  void gcdInt() {
    assertAll(
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(6791, EuclidsAlgorithm.gcd(38_593_253, 53_777_929));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(6791, EuclidsAlgorithm.gcd(53_777_929, 38_593_253));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(6791, EuclidsAlgorithm.gcd(-53_777_929, 38_593_253));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(53_777_929, EuclidsAlgorithm.gcd(53_777_929, 0));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(53_777_929, EuclidsAlgorithm.gcd(0,53_777_929));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(1, EuclidsAlgorithm.gcd(1, 38_593_253));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(1, EuclidsAlgorithm.gcd(53_777_929, 1));
          }
        },
        new Executable() {
          @Override
          public void execute() throws Throwable {
            assertEquals(6791, EuclidsAlgorithm.gcd(53_777_929, -38_593_253));
          }
        }
        );
  }

  @Test
  void gcdLong() {
    assertAll(
        () -> assertEquals(6791, EuclidsAlgorithm.gcd(38_593_253, 53_777_929)),
        () -> assertEquals(6791, EuclidsAlgorithm.gcd(53_777_929, 38_593_253)),
        () -> assertEquals(6791, EuclidsAlgorithm.gcd(-53_777_929, 38_593_253)),
        () -> assertEquals(53_777_929, EuclidsAlgorithm.gcd(53_777_929, 0)),
        () -> assertEquals(53_777_929, EuclidsAlgorithm.gcd(0,53_777_929)),
        () -> assertEquals(1, EuclidsAlgorithm.gcd(1, 38_593_253)),
        () -> assertEquals(1, EuclidsAlgorithm.gcd(53_777_929, 1)),
        () -> assertEquals(6791, EuclidsAlgorithm.gcd(53_777_929, -38_593_253)),
        () -> assertNotEquals(61, EuclidsAlgorithm.gcd(53_777_929, -38_593_253))

        );
  }
}
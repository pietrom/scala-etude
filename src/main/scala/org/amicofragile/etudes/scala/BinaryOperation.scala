package org.amicofragile.etudes.scala

class BinaryOperation(val operation: (Int, Int) => Int) {
  def this() {
    this((a: Int, b: Int) => a + b: Int)
  }

  def perform(x: Int, y: Int): Int = operation(x, y)
}
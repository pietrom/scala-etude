package org.amicofragile.etudes.scala

import org.scalatest.FlatSpec

class BinaryOperationTest extends FlatSpec {
  "A BinaryOperation without init params" should "perform sum" in {
    val op = new BinaryOperation()
    val result = op.perform(11, 19)
    assert(result === 30)
  }

  it should "execute the provided operation, if any" in {
    val prod = (a: Int, b: Int) => a * b: Int
    val op = new BinaryOperation(prod)
    val result = op.perform(5, -10)
    assert(result === -50)
  }
}
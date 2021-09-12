package org.qaze
package example.slots

import scala.util.Random

class Reel(random: Random) {
  private val reel = random.shuffle(Symbol.values.toList)

  def getSymbol(number: Int): Symbol.Value = {
    reel(number)
  }
}

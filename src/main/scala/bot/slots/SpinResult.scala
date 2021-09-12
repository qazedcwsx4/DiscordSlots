package org.qaze
package bot.slots

import bot.slots.Symbol.Symbol

import scala.Function.tupled

case class SpinResult(reels: Seq[Reel],
                      positions: Seq[Int]) {

  def display(): String = {
    Seq(-1, 0, 1).map(getSymbolsLine(reels, positions, _).mkString(" ")).mkString("\n")
  }

  private def getSymbolsLine(reels: Seq[Reel], positions: Seq[Int], offset: Int = 0): Seq[Symbol] = {
    reels.zip(positions) map tupled { (reel, position) => reel.getSymbol(position + offset) }
  }
}

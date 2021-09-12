package org.qaze
package bot.slots

import scala.util.Random

object Slots {
  private val ColumnsCount = 3

  private val random = new Random()

  def spin(): SpinResult = {
    SpinResult(
      Seq.fill(ColumnsCount)(new Reel(random)),
      Seq.fill(ColumnsCount)(random.nextInt(Symbol.values.size))
    )
  }
}

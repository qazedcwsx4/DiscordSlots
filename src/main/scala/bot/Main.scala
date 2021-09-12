package org.qaze
package bot

import ackcord.{APIMessage, ClientSettings}

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Main extends App {
  def add(x: Int, y: Int): Int = x + y

  val token = ""

  val clientSettings = ClientSettings(token)
  val client = Await.result(clientSettings.createClient(), Duration.Inf)

  client.onEventSideEffectsIgnore {
    case APIMessage.Ready(_) => println("Now ready")
  }

  val myCommands = new Commands(client.requests)
  client.commands.runNewNamedCommand(myCommands.hello)

  client.login()

  println("Hello world")
}

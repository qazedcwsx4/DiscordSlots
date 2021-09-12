package org.qaze
package bot

import bot.slots.Slots

import ackcord.Requests
import ackcord.commands.{CommandController, NamedCommand}
import ackcord.syntax.TextChannelSyntax
import akka.NotUsed

class Commands(requests: Requests) extends CommandController(requests) {
  val hello: NamedCommand[NotUsed] = Command
    .named(Seq("!jd"), Seq("zbiki", "slots", "żbiki"))
    .withRequest(m => m.textChannel.sendMessage(Slots.spin().display()))
}

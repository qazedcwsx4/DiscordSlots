package org.qaze
package bot

import com.typesafe.config.ConfigFactory

import java.io.File

case object Config {
  private val ConfigFile = "credentials.conf"

  private val config = ConfigFactory.parseFile(new File(ConfigFile))

  val DiscordKey: String = config.getString("discord_key")
}

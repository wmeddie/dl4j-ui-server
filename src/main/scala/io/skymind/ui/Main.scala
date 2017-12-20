package io.skymind.ui

import org.deeplearning4j.ui.api.UIServer
import org.deeplearning4j.ui.play
import org.deeplearning4j.ui.play.PlayUIServer

object Main {
  def main(args: Array[String]): Unit = {
    val server = new PlayUIServer()

    server.runMain(args)
  }
}

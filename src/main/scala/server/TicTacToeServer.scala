package server

import akka.actor.ActorSystem

object TicTacToeServer {
  // labelled lazy incase resource loading has to occur prior to the creation of our system of actors
  private lazy val system = ActorSystem("tictactoe")

  def main(args: Array[String]): Unit = {
    // TODO
  }
}

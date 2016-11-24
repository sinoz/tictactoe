package tictactoe

import akka.actor.{Actor, ActorLogging, Props}

object Game {
  def apply() =
    Props(new Game)
}

private final class Game extends Actor with ActorLogging {
  override def receive: Receive = {
    case message =>
      unhandled(message)
  }
}

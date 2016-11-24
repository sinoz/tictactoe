package tictactoe

import akka.actor.{Actor, ActorLogging, Props}

object Player {
  def apply() =
    Props(new Player)
}

/** A single player ingame. */
private final class Player extends Actor with ActorLogging {
  override def receive: Receive = {
    case message =>
      unhandled(message)
  }
}

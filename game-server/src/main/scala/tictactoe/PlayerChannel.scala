package tictactoe

import akka.actor.{Actor, ActorRef, Props}
import akka.io.Tcp.Received

object PlayerChannel {
  def apply(game: ActorRef) =
    Props(new PlayerChannel(game))
}

/** The channel handler of a connected player. */
private final class PlayerChannel(game: ActorRef) extends Actor {
  override def receive: Receive = {
    case Received(data) =>
      // TODO

    case message =>
      unhandled(message)
  }
}

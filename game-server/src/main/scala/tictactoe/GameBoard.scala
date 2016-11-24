package tictactoe

import akka.actor.{Actor, ActorLogging, Props}

object GameBoard {
  def apply() =
    Props(new GameBoard)
}

/** The game board in a single `GameSession` that is affected by two participants / `Player`s. */
private final class GameBoard extends Actor with ActorLogging {
  override def receive: Receive = {
    case message =>
      unhandled(message)
  }
}

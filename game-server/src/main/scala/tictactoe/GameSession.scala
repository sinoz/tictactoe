package tictactoe

import akka.actor.{Actor, ActorLogging, ActorRef, Props}

object GameSession {
  def apply(participants: (ActorRef, ActorRef)) =
    Props(new GameSession(participants))
}

/** A session that consists of a board and two players. */
private final class GameSession(participants: (ActorRef, ActorRef)) extends Actor with ActorLogging {
  /** The board that two `Player`s are to play on. */
  val board = context actorOf GameBoard()

  override def receive: Receive = {
    case message =>
      unhandled(message)
  }
}

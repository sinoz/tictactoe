package tictactoe

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/** A companion object for the game actor. */
object Game {
  /** Defines a new game that uses its own `ActorSystem`. */
  def newGame(systemName: String): ActorRef =
    ActorSystem(systemName) actorOf Props(new Game)
}

/** The supervisor; the game itself. */
final class Game extends Actor {
  override def receive: Receive = {
    case x => unhandled(x)
  }
}

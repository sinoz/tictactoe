package tictactoe.game

import akka.actor.{Actor, ActorRef, Props}

/** A companion object containing factory methods related to the Game actor. */
object Game {
  def apply(players: (ActorRef, ActorRef)) = Props(new Game(players))
}

/** A single active game. */
final class Game(players: (ActorRef, ActorRef)) extends Actor {
  private val board = context actorOf Board()

  override def receive: Receive = {
    case x => // TODO
  }
}

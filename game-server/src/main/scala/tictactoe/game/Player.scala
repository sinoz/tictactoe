package tictactoe.game

import akka.actor.{Actor, Props}

/** A companion object containing factory methods related to the Player actor. */
object Player {
  def apply() = Props(new Player)
}

/** A single player. */
final class Player() extends Actor {
  override def receive: Receive = {
    case _ => // TODO
  }
}
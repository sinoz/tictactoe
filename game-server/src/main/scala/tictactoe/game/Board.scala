package tictactoe.game

import akka.actor.{Actor, Props}

/** A companion object to provide factory methods and constants related to the Board actor. */
object Board {
  def apply() = Props(new Board)

  val AmountRows = 3
  val ColumnsPerRow = 3
}

/** The board holding the state of all of the tiles. */
final class Board extends Actor {
  override def receive: Receive = {
    case _ => // TODO
  }
}

final case class Tile()

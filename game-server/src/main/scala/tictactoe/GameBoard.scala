package tictactoe

import akka.actor.{Actor, ActorLogging, Props}
import tictactoe.GameBoard.UpdateTo

object GameBoard {
  def apply() =
    Props(new GameBoard)

  /** A message to update the state of a tile. */
  final case class UpdateTo(id: Int, state: State)

  sealed trait BoardMessage
}

/** The game board in a single `GameSession` that is affected by two participants / `Player`s. */
private final class GameBoard extends Actor with ActorLogging {
  var grid = (0 until 9) map { _ => Tile(Empty) } toArray

  override def receive: Receive = {
    case UpdateTo(id, state) =>
      grid(id).state = state

    case message =>
      unhandled(message)
  }
}

/** The tile to contain a specific mutable state. */
final case class Tile(var state: State)

/** The possible tile states. */
case object X extends State
case object O extends State
case object Empty extends State

/** The state of a tile. */
sealed trait State

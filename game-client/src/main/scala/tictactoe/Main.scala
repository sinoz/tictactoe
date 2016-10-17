package tictactoe

import tictactoe.gdx.GdxApp

/** The entry point to this TicTacToe game client application. */
object Main {
  /** The revision numbers of the game. */
  private val Release = 0
  private val Build = 1
  private val Patch = 1

  /** The title of the game.*/
  private val Title = s"TicTacToe v$Release.$Build.$Patch"

  /** The entry point. */
  def main(args: Array[String]): Unit =
    new GdxApp(Title)
}

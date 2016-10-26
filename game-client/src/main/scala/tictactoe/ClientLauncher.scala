package tictactoe

import tictactoe.gdx.GdxApp
import tictactoe.gdx.scene.SceneRoot
import tictactoe.gdx.scene.login.LoginScene

/** The entry point to this TicTacToe game client application. */
object ClientLauncher extends App {
  /** The revision numbers of the game. */
  val Release = 0
  val Build = 1
  val Patch = 1

  /** The title of the game.*/
  implicit val Title = s"TicTacToe v$Release.$Build.$Patch"

  /** Initializes a new GdxApp and transitions to the game scenery upon completion. */
  GdxApp {
    onCompletion => {
      SceneRoot.transitionTo(LoginScene)
      // TODO
    }
  }
}

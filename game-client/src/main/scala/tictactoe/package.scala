import java.net.InetSocketAddress

import tictactoe.gdx.GdxApp
import tictactoe.gdx.scene.SceneRoot._
import tictactoe.gdx.scene.login.LoginScene

package object tictactoe extends App {
  /** The revision numbers of the game. */
  val Release = 0
  val Build = 1
  val Patch = 1

  /** The title of the game.*/
  implicit val Title = s"TicTacToe v$Release.$Build.$Patch"

  /** The remote address for this client to connect to. */
  implicit val RemoteAddress = new InetSocketAddress(23192)

  /** Initializes a new GdxApp and transitions to the login scenery upon completion. */
  GdxApp {
    onCompletion => {
      transitionTo(LoginScene)
      // TODO
    }
  }
}

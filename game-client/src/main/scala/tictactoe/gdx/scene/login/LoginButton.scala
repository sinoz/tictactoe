package tictactoe
package gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.{Skin, TextButton}
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent

/** The button for the user to press to try and login into the game. */
private[login]final class LoginButton(box: LoginBox)(implicit skin: Skin) extends TextButton("Login", skin) {
  import net._

  addListener(new ChangeListener {
    override def changed(event: ChangeEvent, actor: Actor): Unit = {
      connectRemote { channel =>
        // TODO commit login request packet
      }
    }
  })
}

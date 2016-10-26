package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.{Skin, TextButton}
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent

/** A reset button to reset the username and password input fields. */
private[login]final class FieldResetButton(box: LoginBox)(implicit skin: Skin) extends TextButton("Reset", skin) {
  addListener(new ChangeListener {
    override def changed(event: ChangeEvent, actor: Actor): Unit = {
      box.usernameField.setText("")
      box.passwordField.setText("")
    }
  })
}

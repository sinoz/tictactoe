package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, TextField}

/** The input field for the user to enter his/her username. */
private[login] final class UsernameField(implicit skin: Skin) extends TextField("", skin) {
  setPasswordMode(false)
}

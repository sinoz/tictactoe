package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, TextField}

/** The input field for the user to enter his/her account password. */
private[login] final class PasswordField(implicit skin: Skin) extends TextField("", skin) {
  setPasswordMode(true)
  setPasswordCharacter('*')
}

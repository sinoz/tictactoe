package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.ui.{Label, Skin, Window}

/** A box containing all of the input fields for the user to enter the account credentials. */
private[login] final class LoginBox(implicit skin: Skin) extends Window("", skin) {
  /** The two input fields. */
  val usernameField = new UsernameField()
  val passwordField = new PasswordField()

  // add subordinate widgets
  add(new Label("Username", skin)).padRight(5F)
  add(usernameField).row()
  add(new Label("Password", skin)).padRight(5F)
  add(passwordField).row()
}

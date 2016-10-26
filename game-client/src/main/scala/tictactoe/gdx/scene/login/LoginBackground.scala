package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** The user interface background for in the login scenery. */
private[login] final class LoginBackground(implicit skin: Skin) extends Table(skin) {
  // add subordinate widgets
  add(new LoginBox())

  // configures this background
  setFillParent(true)
}

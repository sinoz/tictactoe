package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** The user interface background for in the login scenery. */
private[login] final class LoginBackground(implicit skin: Skin) extends Table(skin) {
  val box = new LoginBox()

  /** The login button to enter the game and the field reset/cancellation
    * button to reset the input fields. */
  val loginBtn = new LoginButton(box)
  val resetBtn = new FieldResetButton(box)

  // add subordinate widgets
  add(box).colspan(2).padBottom(5F).row()
  add(loginBtn).width(box.getPrefWidth / 2)
  add(resetBtn).width(box.getPrefWidth / 2)

  // configures this background
  setFillParent(true)
}

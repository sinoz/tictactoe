package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** The user interface background for in the game scenery. */
private[game] final class GameBackground(implicit skin: Skin) extends Table(skin) {
  // add subordinate widgets
  add(new DecisionGrid())

  // configure the background
  setBackground("default-window")
  setFillParent(true)
  pack()
}

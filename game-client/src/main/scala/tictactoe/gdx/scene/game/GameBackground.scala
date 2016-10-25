package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** The background table widget. */
private[game] final class GameBackground(skin: Skin) extends Table(skin) {
  val grid = new DecisionGrid(skin)
  add(grid)

  setBackground("default-window")
  setFillParent(true)
  pack()
}

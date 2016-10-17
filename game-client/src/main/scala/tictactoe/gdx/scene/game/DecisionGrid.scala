package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** A grid of decision buttons. */
final class DecisionGrid(skin: Skin) extends Table {
  (1 until 10) foreach { index =>
    val k = add(new DecisionButton(s"$index", skin)).width(128).height(128)
    if ((index % 3) == 0) {
      k.row()
    }
  }
}

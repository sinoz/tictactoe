package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** A 9x9 grid of decision buttons. */
final class DecisionGrid(skin: Skin) extends Table {
  val ColumnsPerRow = 3

  (1 until 10) foreach { index =>
    val button = new DecisionButton(skin)
    val addedCell = add(button).width(128).height(128) // TODO scalable width/height instead of fixed 128?
    if ((index % ColumnsPerRow) == 0) {
      // 3 columns for each row
      addedCell.row()
    }
  }
}

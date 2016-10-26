package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.ui.{Skin, Table}

/** A grid of decision buttons. */
private[game] final class DecisionGrid(implicit skin: Skin) extends Table(skin) {
  /** The grid size measurements. */
  private val ColumnsPerRow = 3
  private val AmountRows = 3

  /** The grid mapped to a sequence of buttons. */
  val buttons = (1 until (ColumnsPerRow * AmountRows) + 1) map { index =>
    val button = new DecisionButton()
    val addedCell = add(button).width(128).height(128) // TODO scalable width/height instead of fixed 128?
    if ((index % ColumnsPerRow) == 0) {
      // 3 columns for each row
      addedCell.row()
    }

    button
  }
}

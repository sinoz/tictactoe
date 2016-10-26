package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.{Skin, TextButton}
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent

/** A single decision on the grid. */
private[game] final class DecisionButton(implicit skin: Skin) extends TextButton("", skin) {
  /** The text display to mutate to once selected. */
  private val PleaseWaitText = "Processing..."

  addListener(new ChangeListener {
    override def changed(event: ChangeEvent, actor: Actor): Unit = {
      // TODO transmit message
      setText(PleaseWaitText)
      setDisabled(true)
    }
  })
}

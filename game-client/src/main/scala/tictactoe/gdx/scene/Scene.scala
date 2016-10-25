package tictactoe.gdx.scene

import com.badlogic.gdx.utils.Disposable

/** A scene of drawable components that must be presented onto a stage. */
trait Scene extends Disposable {
  /** Called when the application was resized. */
  def resize(width: Int, height: Int): Unit

  /** Called when the application must hide its scenes from the stage. */
  def hide(): Unit

  /** Called when the application must present its scenes onto the stage. */
  def show(): Unit

  /** Called when the application must put a pause onto its rendering course. */
  def pause(): Unit

  /** Called when the application must resume its rendering course. */
  def resume(): Unit

  /** Called every frame to draw the scenes. */
  def render(): Unit
}

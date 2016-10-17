package tictactoe.gdx.scene

import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Disposable

/** Manages all of the scenes. */
final class SceneRoot(inputMultiplexer: InputMultiplexer) extends Disposable {
  /** The stage the scenes live on. */
  private val stage = new Stage

  /** Called when the application must be resized. */
  def resize(width: Int, height: Int): Unit = {
    // TODO
  }

  /** Called when the application must hide its scenes from the stage. */
  def hide(): Unit = {
    // TODO
  }

  /** Called when the application must present its scenes onto the stage. */
  def show(): Unit = {
    // TODO
  }

  /** Called when the application must put a pause onto its rendering course. */
  def pause(): Unit = {
    // TODO
  }

  /** Called when the application must resume its rendering course. */
  def resume(): Unit = {
    // TODO
  }

  /** Called every frame to draw the scenes. */
  def render(): Unit = {
    // TODO
  }

  override def dispose(): Unit = {
    stage.dispose()
  }

  inputMultiplexer.addProcessor(stage)
}

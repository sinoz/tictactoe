package tictactoe.gdx.scene

import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.viewport.ScreenViewport
import tictactoe.gdx.scene.game.{GameClassification, GameScene}

/** Manages all of the scenes. */
final class SceneRoot(inputMultiplexer: InputMultiplexer) extends Disposable {
  /** The stage the scenes live on. */
  private val stage = new Stage(new ScreenViewport())

  /** The collection of active scenes. */
  private var scenes = Map[SceneClassification, Scene]()

  /** The currently presented scene. */
  var current: Option[Scene] = None

  /** Transitions between the current scene and the given scene. */
  def transitionTo(c: SceneClassification): Unit = {
    if (current.isDefined) {
      current.get.hide()
    }

    current = scenes.get(c)
    if (current.isEmpty) {
      val newScene = c match {
        case GameClassification => new GameScene(stage)
        case _ => throw SceneException("Unsupported SceneClassification for transition")
      }

      scenes += (c -> newScene)
      current = Some(newScene)
    }

    current.get.show()
  }

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

case class SceneException(msg: String) extends Exception(msg)
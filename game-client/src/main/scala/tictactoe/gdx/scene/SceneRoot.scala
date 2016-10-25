package tictactoe.gdx.scene

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.viewport.ScreenViewport
import tictactoe.gdx.GdxCanvas
import tictactoe.gdx.scene.game.GameScene

/** Manages all of the scenes. */
object SceneRoot extends Disposable {
  /** The stage the scenes live on. */
  val stage = new Stage(new ScreenViewport())

  /** The collection of active scenes. */
  private var scenes = Set[Scene]()

  /** The currently presented scene. */
  var current: Option[Scene] = None

  /** Transitions between the current scene and the given scene. */
  def transitionTo(target: Scene): Unit = {
    if (current.isDefined) {
      current.get.hide()
    }

    current = Some(target)
    if (!scenes.contains(target)) {
      scenes += target
    }

    updateViewport(Gdx.graphics.getWidth, Gdx.graphics.getHeight, centerCamera = true)
    current.get.show()
  }

  /** Called when the application must be resized. */
  def resize(width: Int, height: Int): Unit = {
    updateViewport(width, height, centerCamera = true)
    current.get.resize(width, height)
  }

  /** Updates the viewport according to the given parameters. */
  private def updateViewport(width: Int, height: Int, centerCamera: Boolean): Unit = {
    stage.getViewport.update(width, height, centerCamera)
  }

  /** Called when the application must hide its scenes from the stage. */
  def hide(): Unit = {
    current.get.hide()
  }

  /** Called when the application must present its scenes onto the stage. */
  def show(): Unit = {
    current.get.show()
  }

  /** Called when the application must put a pause onto its rendering course. */
  def pause(): Unit = {
    current.get.pause()
  }

  /** Called when the application must resume its rendering course. */
  def resume(): Unit = {
    current.get.resume()
  }

  /** Called every frame to draw the scenes. */
  def render(): Unit = {
    stage.act(Gdx.graphics.getDeltaTime)
    stage.draw()
  }

  override def dispose(): Unit = {
    stage.dispose()
  }

  transitionTo(GameScene)
  GdxCanvas.inputMultiplexer.addProcessor(SceneRoot.stage)
}

case class SceneException(msg: String) extends Exception(msg)
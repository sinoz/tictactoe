package tictactoe.gdx

import com.badlogic.gdx.{ApplicationListener, Gdx, InputMultiplexer}
import tictactoe.gdx.scene.SceneRoot
import tictactoe.gdx.scene.game.GameScene

/** The canvas of this application that receives and flows user events to its child components. */
object GdxCanvas extends ApplicationListener {
  private var inputMultiplexer: InputMultiplexer = null
  var scenes: SceneRoot = null

  override def create(): Unit = {
    inputMultiplexer = new InputMultiplexer()

    scenes = new SceneRoot(inputMultiplexer)
    scenes.transitionTo(GameScene)

    Gdx.input.setInputProcessor(inputMultiplexer)
  }

  override def resize(width: Int, height: Int): Unit =
    scenes.resize(width, height)

  override def dispose(): Unit =
    scenes.dispose()

  /** Toggles the state of the continuous rendering flag. Disabling continuous rendering can potentially
    * save a user's resources (think of battery power). */
  def continuousRendering(enabled: Boolean) =
    Gdx.graphics.setContinuousRendering(enabled)

  override def resume(): Unit = {
    continuousRendering(enabled = true)
    scenes.resume()
  }

  override def pause(): Unit = {
    continuousRendering(enabled = false)
    scenes.pause()
  }

  override def render(): Unit =
    scenes.render()
}

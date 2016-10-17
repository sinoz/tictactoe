package tictactoe.gdx

import com.badlogic.gdx.{ApplicationListener, Gdx, InputMultiplexer}
import tictactoe.gdx.scene.SceneRoot

/** The canvas of this application that receives and flows user events to its child components. */
object GdxCanvas extends ApplicationListener {
  private var inputMultiplexer: InputMultiplexer = null
  private var scenes: SceneRoot = null

  override def create(): Unit = {
    inputMultiplexer = new InputMultiplexer()
    scenes = new SceneRoot(inputMultiplexer)

    Gdx.input.setInputProcessor(inputMultiplexer)
  }

  override def resize(width: Int, height: Int): Unit =
    scenes.resize(width, height)

  override def dispose(): Unit =
    scenes.dispose()

  override def pause(): Unit =
    scenes.pause()

  override def render(): Unit =
    scenes.render()

  override def resume(): Unit =
    scenes.resume()
}

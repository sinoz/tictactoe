package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.ui.Skin
import tictactoe.gdx.assets.GameAssets
import tictactoe.gdx.scene.{Scene, SceneRoot}

/** The scene to render while in game. */
object GameScene extends Scene {
  /** The vast collection of graphical elements to use for the user interface widgets. */
  private val skin = GameAssets.fetch("uiskin", classOf[Skin])

  /** Creates and adds the background to the stage. */
  val background = new GameBackground(skin)
  SceneRoot.stage.addActor(background)

  override def resize(width: Int, height: Int): Unit = {
    // TODO
  }

  override def hide(): Unit = {
    background.setVisible(false)
  }

  override def pause(): Unit = {
    // TODO
  }

  override def render(): Unit = {
    // TODO
  }

  override def show(): Unit = {
    background.setVisible(true)
  }

  override def resume(): Unit = {
    // TODO
  }

  override def dispose(): Unit = {
    skin.dispose()
  }
}

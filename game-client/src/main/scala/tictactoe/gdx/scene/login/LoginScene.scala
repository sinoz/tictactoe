package tictactoe.gdx.scene.login

import com.badlogic.gdx.scenes.scene2d.ui.Skin
import tictactoe.gdx.assets.GameAssets
import tictactoe.gdx.scene.{Scene, SceneRoot}

/** The scene to render when the user should login into the game. */
object LoginScene extends Scene {
  /** The vast collection of graphical elements to use for the user interface widgets. */
  private implicit val skin = GameAssets.fetch("uiskin", classOf[Skin])

  /** Creates and adds the background to the stage. */
  val background = new LoginBackground()
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
    // TODO
  }
}

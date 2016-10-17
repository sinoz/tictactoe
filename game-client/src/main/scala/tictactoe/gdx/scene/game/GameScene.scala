package tictactoe.gdx.scene.game

import java.io.File

import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import tictactoe.gdx.scene.{Scene, SceneClassification}

/** The scene to render while in game. */
final class GameScene(stage: Stage) extends Scene {
  // TODO clean up
  private val classLoader = getClass.getClassLoader
  private val skinPath = new File(classLoader.getResource("uiskin.json").getFile)
  private val skin = new Skin(new FileHandle(skinPath))

  val gameWindow = new GameWindow(skin)
  stage.addActor(gameWindow)

  override def resize(width: Int, height: Int): Unit = {
    // TODO
  }

  override def hide(): Unit = {
    // TODO
  }

  override def pause(): Unit = {
    // TODO
  }

  override def render(): Unit = {
    // TODO
  }

  override def show(): Unit = {
    // TODO
  }

  override def resume(): Unit = {
    // TODO
  }

  override def dispose(): Unit = {
    // TODO
  }

  override def classification(): SceneClassification =
    GameClassification
}

/** The classification for the game scene. */
case object GameClassification extends SceneClassification

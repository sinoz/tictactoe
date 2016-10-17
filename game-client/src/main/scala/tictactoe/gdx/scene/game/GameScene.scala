package tictactoe.gdx.scene.game

import com.badlogic.gdx.scenes.scene2d.Stage
import tictactoe.gdx.scene.{Scene, SceneClassification}

/** The scene to render while in game. */
final class GameScene(stage: Stage) extends Scene {
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

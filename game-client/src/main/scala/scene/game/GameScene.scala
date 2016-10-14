package scene.game

import scene.{SceneActions, SceneClassification}

import scalafx.scene.Scene

/** The scene for in game. */
final class GameScene(width: Double, height: Double) extends Scene(width, height) with SceneActions {
  override def hide(): Unit = {
    // TODO
  }

  override def show(): Unit = {
    // TODO
  }
}

/** The unique classification for the GameScene. */
case object GameClassification extends SceneClassification

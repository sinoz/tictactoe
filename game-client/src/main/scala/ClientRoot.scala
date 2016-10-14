import scene.SceneRoot
import scene.game.GameClassification

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage

/** The entry point to this FX application. */
object ClientRoot extends JFXApp {
  stage = new PrimaryStage {
    title = "TicTacToeFX"

    SceneRoot transitionTo GameClassification
  }
}

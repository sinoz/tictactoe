package client

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene

object TicTacToeClient extends JFXApp {
  val TITLE = "TicTacToeFX"

  stage = new PrimaryStage {
    title = TITLE

    scene = new Scene(800, 600) {
      // TODO
    }
  }
}

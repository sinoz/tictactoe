package tictactoe.gdx

import com.badlogic.gdx.Gdx

/** Contains a collection of scala helper methods related to Gdx. */
trait GdxHelpers {
  def later(toExec: => Unit): Unit = {
    Gdx.app.postRunnable(new Runnable {
      override def run(): Unit = toExec
    })
  }
}

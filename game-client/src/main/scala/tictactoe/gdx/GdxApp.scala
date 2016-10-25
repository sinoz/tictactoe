package tictactoe.gdx

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

/** The configuration instance for a default gdx application. */
private[gdx] final class GdxAppConfig(t: String) extends LwjglApplicationConfiguration {
  title = t
  width = LwjglApplicationConfiguration.getDesktopDisplayMode.width
  height = LwjglApplicationConfiguration.getDesktopDisplayMode.height
  resizable = true
  vSyncEnabled = false
}

/** A companion object for GdxApp. */
object GdxApp {
  def apply(onCompletion: Unit => Unit)(implicit title: String) = new GdxApp(onCompletion)
}

final class GdxApp(onCompletion: Unit => Unit)(implicit title: String) extends LwjglApplication(GdxCanvas, new GdxAppConfig(title)) with GdxHelpers {
  /** Called when the user has attempted to manually exit the application. */
  override def exit(): Unit = {
    super.exit()
  }

  later { onCompletion() }
}

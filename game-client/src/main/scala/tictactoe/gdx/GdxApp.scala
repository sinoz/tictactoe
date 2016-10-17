package tictactoe.gdx

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

/** The configuration instance for a default gdx application. */
final class GdxAppConfig(t: String) extends LwjglApplicationConfiguration {
  title = t
  width = LwjglApplicationConfiguration.getDesktopDisplayMode.width
  height = LwjglApplicationConfiguration.getDesktopDisplayMode.height
  resizable = true
  vSyncEnabled = false
}

final class GdxApp(title: String) extends LwjglApplication(GdxCanvas, new GdxAppConfig(title)) {
  /** Called when the user has attempted to manually exit the application. */
  override def exit(): Unit = {
    super.exit()
  }
}

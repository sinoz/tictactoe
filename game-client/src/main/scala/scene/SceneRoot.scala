package scene

import scalafx.scene.Scene

/** Manages all scenes and transitioning between these scenes for the stage. */
object SceneRoot extends SceneActions {
  type SceneType = Scene with SceneActions

  /** The collection of scenes. */
  private var scenes = Map[SceneClassification, SceneType]()

  /** The current active scene on the stage. */
  private var activeScene: Option[SceneType] = None

  /** Transitions between the current scene and the specified scene, if possible. */
  def transitionTo(classification: SceneClassification): Unit = {
    // TODO
  }

  override def hide(): Unit = activeScene match {
    case Some(s) => s.hide()
    case None => throw SceneException("hide() called on absent scene")
  }

  override def show(): Unit = activeScene match {
    case Some(s) => s.show()
    case None => throw SceneException("show() called on absent scene")
  }
}

final case class SceneException(msg: String) extends Exception(msg)

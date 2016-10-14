package scene

/** A trait of actions related to scenes. */
trait SceneActions {
  /** Hides the scene from the stage. */
  def hide(): Unit

  /** Presents the scene onto the stage. */
  def show(): Unit
}

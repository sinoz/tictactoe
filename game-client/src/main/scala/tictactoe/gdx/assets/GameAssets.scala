package tictactoe.gdx.assets

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.SkinLoader
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.utils.Disposable
import tictactoe.gdx.assets.resolve.SkinFileHandleResolver

/** Loads and manages all of the assets. Internally done by AssetManager. */
object GameAssets extends Disposable {
  /** Internally manages all of the assets. */
  private val assetsManager = new AssetManager()

  /** Fetches an asset. An asset will be loaded into memory if it hasn't been loaded previously. */
  def fetch[T](fileName: String, classType: Class[T]): T = {
    if (!assetsManager.isLoaded(fileName, classType)) {
      assetsManager.load(fileName, classType)
      assetsManager.finishLoading()
    }

    assetsManager.get(fileName, classType)
  }

  /** Evicts the specified file by unloading it from the manager and memory. */
  def evict(fileName: String): Unit = assetsManager.unload(fileName)

  override def dispose(): Unit = {
    assetsManager.clear()
    assetsManager.dispose()
  }

  // Now to assign the corresponding file handle resolvers to the appropriate loaders
  assetsManager.setLoader(classOf[Skin], new SkinLoader(SkinFileHandleResolver))
}

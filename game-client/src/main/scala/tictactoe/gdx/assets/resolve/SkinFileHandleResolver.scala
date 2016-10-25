package tictactoe.gdx.assets.resolve

import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle

/** Resolves skin files from a specific location and of a specific file extension. */
object SkinFileHandleResolver extends FileHandleResolver {
  private val FormatExtension = "json"
  private val classLoader = getClass.getClassLoader

  override def resolve(fileName: String): FileHandle =
    new FileHandle(classLoader.getResource(s"$fileName.$FormatExtension").getFile)
}

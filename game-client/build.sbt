name := "game-client"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.badlogicgames.gdx" % "gdx" % "1.9.4",
  "com.badlogicgames.gdx" % "gdx-platform" % "1.9.4" classifier("natives-desktop"),
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.9.4",
  "org.scalatest" % "scalatest_2.11" % "3.0.1-SNAP1"  % "test"
)
    
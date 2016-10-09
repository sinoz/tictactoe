name := "game-client"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "io.netty"                % "netty-all"             % "4.1.5.Final",
  "org.scalafx"             %     "scalafx_2.11"      % "8.0.102-R11",
  "org.scalatest"           %%    "scalatest"         % "2.2.4"       % "test"
)

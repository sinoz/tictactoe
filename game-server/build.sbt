name := "game-server"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.11",
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.4.11"
)
    
name := "game-server"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "io.netty"                % "netty-all"             % "4.1.5.Final",
  "com.typesafe.akka"       %     "akka-actor_2.11"   % "2.4.11",
  "com.typesafe.akka"       %     "akka-testkit_2.11" % "2.4.11"      % "test",
  "org.scalatest"           %%    "scalatest"         % "2.2.4"       % "test"
)

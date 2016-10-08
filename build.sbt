name := "akka-scala-seed"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalafx"             %     "scalafx_2.11"      % "8.0.102-R11",
  "com.typesafe.akka"       %     "akka-actor_2.11"   % "2.4.11",
  "com.typesafe.akka"       %     "akka-testkit_2.11" % "2.4.11"      % "test",
  "org.scalatest"           %%    "scalatest"         % "2.2.4"       % "test"
)

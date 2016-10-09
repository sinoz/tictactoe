import sbt._

/**
  * based on http://www.scala-sbt.org/release/docs/Getting-Started/Multi-Project
  */
object HelloBuild extends Build {
  // aggregate: running a task on the aggregate project will also run it
  // on the aggregated projects.
  // dependsOn: a project depends on code in another project.
  // without dependsOn, you'll get a compiler error: "object bar is not a
  // member of package com.alvinalexander".
  lazy val root = Project(id = "tictactoefx", base = file(".")) aggregate(client, server) dependsOn(client, server)

  // sub-project in the Foo subdirectory
  lazy val client = Project(id = "game-client", base = file("game-client"))
  lazy val server = Project(id = "game-server", base = file("game-server"))
}
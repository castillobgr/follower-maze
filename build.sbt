name := "follower-maze"

version := "0.1"

scalaVersion := "2.12.4"

lazy val `follower-maze` = project.in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor"  % "2.5.9",
      "com.typesafe.akka" %% "akka-stream" % "2.5.9"
    )
  )
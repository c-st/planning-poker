name := """pp-backend"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaVersion = "2.4.9"

  Seq(
    "com.typesafe.akka" %% "akka-actor"             % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit"           % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core"         % akkaVersion,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
    "com.owlike"        %% "genson-scala"           % "1.4",
    "org.scalatest"     %% "scalatest"              % "3.0.0"       % "test"
  )
}

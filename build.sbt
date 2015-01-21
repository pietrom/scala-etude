lazy val commonSettings = Seq(
  organization := "org.amicofragile",
  version := "1.0.0-SNAPSHOT",
  scalaVersion := "2.11.5"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "scala-etude"
  )

libraryDependencies ++= Seq(
    	"junit" % "junit" % "4.8.1" % "test",
	"org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)


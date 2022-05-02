ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.guizmaii.datadog.reproducer"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "datadog-reproducer",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.14",
      "dev.zio" %% "zio-test" % "1.0.14" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )

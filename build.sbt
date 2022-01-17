enablePlugins(ScalaJSPlugin)

lazy val scala212 = "2.12.15"
lazy val scala213 = "2.13.8"
lazy val scala3 = "3.1.0"
ThisBuild / crossScalaVersions := Seq(scala212, scala213, scala3)
ThisBuild / scalaVersion := scala213
name := "scalajs-nodejs-markers"
organization := "net.exoego"

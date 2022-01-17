import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._

licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/exoego/scalajs-nodejs-markers"),
    "scm:git:git@github.com:exoego/scalajs-nodejs-markers.git"
  )
)
homepage := scmInfo.value.map(_.browseUrl)
developers := List(
  Developer(
    id = "exoego",
    name = "TATSUNO Yasuhiro",
    email = "ytatsuno.jp@gmail.com",
    url = url("https://www.exoego.net")
  )
)
Test / publishArtifact := false
Compile / packageDoc / publishArtifact := true
Compile / packageSrc / publishArtifact := true
pomIncludeRepository := { _ =>
  false
}

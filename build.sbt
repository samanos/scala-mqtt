organization := "io.github.samanos"
name := "mqtt"

scalaVersion := "2.11.8"
scalacOptions += "-feature"

val Akka = "2.4.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka"    %% "akka-stream"                     % Akka,
  "org.eclipse.paho"      % "org.eclipse.paho.client.mqttv3"  % "1.0.2",
  "org.bouncycastle"      % "bcprov-jdk15on"                  % "1.54"
)

enablePlugins(GitVersioning)
git.useGitDescribe := true

bintrayOrganization := Some("samanos")
licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

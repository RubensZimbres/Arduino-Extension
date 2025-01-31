import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name := "arduino"
version := "3.0.1"
isSnapshot := true

scalaVersion := "2.12.12"
scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xlint", "-Xfatal-warnings", "-encoding", "us-ascii")

javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path", "-encoding", "us-ascii")

netLogoVersion := "6.2.2"
netLogoClassManager := "arduino.ArduinoExtension"
netLogoPackageExtras += (baseDirectory.value / "lib" / "jssc-2.6.0.jar" -> None)

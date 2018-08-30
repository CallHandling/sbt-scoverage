libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")

addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.16.0")
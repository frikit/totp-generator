import sbt._

object LibraryDependencies {

  val compile: Seq[ModuleID] = Seq(
    "commons-codec"         %  "commons-codec" % "1.20.0"
  )

  val test: Seq[ModuleID] = Seq(
    "org.scalatest"         %% "scalatest"     % "3.2.19",
    "com.vladsch.flexmark"  %  "flexmark-all"  % "0.64.8"
  ).map(_ % Test)
}

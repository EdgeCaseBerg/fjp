import scalariform.formatter.preferences._

organization := "com.github.edgecaseberg"

name := "fjp-prototype"

version := "0.0.0-SNAPSHOT" 

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala,SbtWeb)

libraryDependencies ++= { 
	Seq(
		"com.typesafe" % "config" % "1.2.1",
		"com.h2database"  %  "h2"                % "1.4.187",
		"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
	)
}

scalariformPreferences := scalariformPreferences.value
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)
  .setPreference(AlignParameters, false)
  .setPreference(IndentWithTabs, true)
  .setPreference(MultilineScaladocCommentsStartOnFirstLine, true)
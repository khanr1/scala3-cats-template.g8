import Dependencies.*

ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / organization := "$organization;format="lower,package"$"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(name := "$name$")
    .settings(dependencies)





lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    Libraries.catsEffect.value,
    Libraries.cats.value,
    Libraries.monocle.value,
    Libraries.kitten.value
  ),
  testFrameworks+=new TestFramework("weaver.framework.CatsEffect"),
  libraryDependencies ++= Seq(
    Libraries.weaverCats,
    Libraries.weaverDiscipline,
    Libraries.weaverScalaCheck,
  ).map(_ % Test)
)


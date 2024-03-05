import Dependencies.*

ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "\$scala_version3\$"
ThisBuild / organization := "$organization;format="lower,package"$"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(name := "$name$")
    .settings(dependencies)





lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    Libraries.catsEffect,
    Libraries.cats,
    Libraries.monocle,
    Libraries.refined,
    Libraries.kitten

  ),
  testFrameworks+=new TestFramework("weaver.framework.CatsEffect"),
  libraryDependencies ++= Seq(
    Libraries.weaverCats,
    Libraries.weaverDiscipline,
    Libraries.weaverScalaCheck,
    Libraries.scalacheck
  ).map(_ % Test)
)


import sbt.*

object Dependencies {

  object Version {
    // common
    val cats = "2.10.0"
    val refined = "0.11.1"
    val catsEffect = "3.5.3"
    val monocle = "3.2.0"
    val kitten = "3.2.0"

    // test
    val scalacheck = "1.17.0"
    val weaver = "0.8.4"

  }

  object Libraries {

    val cats = "org.typelevel" %% "cats-core" % Version.cats
    val catsEffect = "org.typelevel" %% "cats-effect" % Version.catsEffect
    val kitten = "org.typelevel" %% "kittens" % Version.kitten
    val monocle = "dev.optics" %% "monocle-core" % Version.monocle
    val refined = "eu.timepit" %% "refined" % Version.refined

    // test
    val scalacheck = "org.scalacheck" %% "scalacheck" % Version.scalacheck
    val weaverCats = "com.disneystreaming" %% "weaver-cats" % Version.weaver
    val weaverDiscipline = "com.disneystreaming" %% "weaver-discipline" % Version.weaver
    val weaverScalaCheck = "com.disneystreaming" %% "weaver-scalacheck" % Version.weaver

  }
}

import sbt.*

object Dependencies {

  object Version {
    // common
    val cats = $cats_version$
    val refined = $refined_version$
    val catsEffect = $catsEffect_version$
    val monocle = $monocle_version$
    val kitten = $kitten_version$

    // test
    val scalacheck = $scalacheck_version$
    val weaver = $weaver_version$

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

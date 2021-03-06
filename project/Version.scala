object Version {
  val compiler = "2.11.7"
  val compiler_2 = "2.10.5"
  val compilerIsRC = false

  private val isSnapshot = false
  private def snapshot = if (isSnapshot) "-SNAPSHOT" else ""
  private val major = "1.10"
  val all         = s"$major.1$snapshot"
  val core        = s"$major.1$snapshot"
  val constrained = s"$major.1$snapshot"
  val dot         = s"$major.1$snapshot"
  val json        = s"$major.0$snapshot"
  val misc        = s"$major.0$snapshot"
}
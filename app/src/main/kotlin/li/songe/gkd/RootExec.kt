package li.songe.gkd

object RootExec {
    fun tap(x: Int, y: Int) {
        try {
            Runtime.getRuntime().exec(arrayOf("su", "-c", "input tap $x $y"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

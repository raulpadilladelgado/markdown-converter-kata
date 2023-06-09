class TerminalInterpreter(private val convertLinksToFootnotes: ConvertLinksToFootnotes) {
    fun execute(args: Array<String>) {
        if (args[0] == "link2footnote") {
            convertLinksToFootnotes.execute(args[1], args[2])
            return
        }
        throw UnknownCommandError()
    }
}

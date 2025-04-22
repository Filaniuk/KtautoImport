package mfilaniu
import java.util.jar.JarFile
import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: ./your-solution <PartialClassName>")
        exitProcess(1)
    }

    val query = args[0]

    val stdlibPath = System.getProperty("java.class.path")
        .split(File.pathSeparator)
        .firstOrNull { it.contains("kotlin-stdlib") }

    if (stdlibPath == null) {
        println("Could not find kotlin-stdlib in classpath.")
        exitProcess(1)
    }

    val classNames = mutableListOf<String>()
    val jarFile = JarFile(stdlibPath)

    jarFile.entries().asSequence().forEach { entry ->
        val name = entry.name
        if (name.endsWith(".class") && name.startsWith("kotlin/") && !name.contains('$')) {
            val fqcn = name
                .removeSuffix(".class")
                .replace('/', '.')
            classNames.add(fqcn)
        }
    }

    val suggestions = classNames.filter { it.substringAfterLast(".").startsWith(query) }

    if (suggestions.isEmpty()) {
        println("No suggestions found for \"$query\"")
    } else {
        suggestions.forEach(::println)
    }
}
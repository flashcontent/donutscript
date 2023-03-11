args = args.toList()

def printHelp() {
    println('Help:')
    println('version: show version')
    println('help: show this')
    println('java: compile a .donut file to a .jar file.')
    println('about: show about DonutScript')
    println('')
}

def printVersion() {
    println('')
    println('DonutScript 1.0.0')
    println('')
}

def printAbout() {
    println('')
    println('DonutScript is a script language based on ActionScript that compiles to JVM and AVM')
    println('It is created by FlashContent for creating games, applications and websites.')
    println('')
}

if (args.size() == 0) {
    println('')
    println('Use: donut -command- -options-')
    println('Are you looking for the commands? Use help instead.')
    println('')
} else if (args[0] == 'help') {
    printHelp()
} else if (args[0] == 'version') {
    printVersion()
} else if (args[0] == 'java') {
    println('')
    println('Currently not available :(')
    println('')
} else if (args[0] == 'about') {
    printAbout()
} else {
    println('')
    println('Invalid command. Use help to see available commands.')
    println('')
}

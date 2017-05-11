<<<<<<< HEAD:smartapps/jscgs350/dashboard-battery-monitor-parent.src/dashboard-battery-monitor-parent.groovy
definition(
    name: "Dashboard - Battery Monitor Parent",
    singleInstance: true,
    namespace: "jscgs350",
    author: "jscgs350",
    description: "Battery Monitor",
    category: "My Apps",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")

preferences {
    page(name: "mainPage", title: "Battery Monitor", install: true, uninstall: true,submitOnChange: true) {
            section {
                    app(name: "childRules", appName: "Dashboard - Battery Monitor Child", namespace: "jscgs350", title: "Create Battery Monitor...", multiple: true)
            }
    }
}

def installed() {
    initialize()
}

def updated() {
    unsubscribe()
    initialize()
}

def initialize() {
    childApps.each {child ->
            log.info "Installed Monitors: ${child.label}"
    }
=======
definition(
    name: "Dashboard - Battery Monitor",
    singleInstance: true,
    namespace: "jscgs350",
    author: "jscgs350",
    description: "Dashboard - Battery Monitor",
    category: "My Apps",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")

preferences {
    page(name: "mainPage", title: "Dashboard - Battery Monitor", install: true, uninstall: true,submitOnChange: true) {
            section {
                    app(name: "childRules", appName: "Dashboard - Battery Monitor Child", namespace: "jscgs350", title: "Create Battery Monitor...", multiple: true)
            }
    }
}

def installed() {
    initialize()
}

def updated() {
    unsubscribe()
    initialize()
}

def initialize() {
    childApps.each {child ->
            log.info "Installed Monitors: ${child.label}"
    }
>>>>>>> constjs/master:smartapps/jscgs350/dashboard-battery-monitor.src/dashboard-battery-monitor.groovy
}
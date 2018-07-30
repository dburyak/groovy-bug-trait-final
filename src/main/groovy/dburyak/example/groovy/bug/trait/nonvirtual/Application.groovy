package dburyak.example.groovy.bug.trait.nonvirtual

class Application {
    static printClassInfo(obj) {
        if (obj == null) {
            println "null"
            return
        }
        println 'fields :'
        obj.class.fields.each {
            println "  ${it}"
        }
        println 'methods :'
        obj.class.methods.each {
            println "  ${it}"
        }
    }

    static void main(String[] args) {
        println "Groovy : ${GroovySystem.version}"
        println 'OVERRIDE :'
        def activity = new ActivityOverride(name: 'a1')
        activity.start()
        activity.stop()
        printClassInfo(activity)

        println 'INHERIT :'
        activity = new ActivityInherit(value: 42)
        activity.start()
        activity.stop()
        printClassInfo(activity)
    }
}

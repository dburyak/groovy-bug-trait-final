package dburyak.example.groovy.bug.trait.nonvirtual

class ActivityOverride implements Suspendable {
    String name = ''

    final void start() {
        println "override trait final method : no hooks : start ${name}"
    }

    final void stop() {
        println "override trait final method : no hooks : stop ${name}"
    }

    @Override
    void doOnStart() {
        println "never called : ${name}"
    }

    @Override
    void doOnStop() {
        println "never called : ${name}"
    }
}

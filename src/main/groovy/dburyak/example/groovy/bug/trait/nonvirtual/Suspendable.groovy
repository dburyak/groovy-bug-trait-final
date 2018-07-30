package dburyak.example.groovy.bug.trait.nonvirtual

trait Suspendable {
    private boolean active = false

    boolean isActive() {
        active
    }

    final void start() {
        if (!active) {
            doOnStart()
            active = true
        }
    }

    final void stop() {
        if (active) {
            doOnStop()
            active = false
        }
    }

    abstract void doOnStart()
    abstract void doOnStop()
}

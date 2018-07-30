package dburyak.example.groovy.bug.trait.nonvirtual

class ActivityInherit implements Suspendable {
    Integer value = 42

    @Override
    void doOnStart() {
        println "inheriting activity calls hooks : doOnStart : ${value}"
    }

    @Override
    void doOnStop() {
        println "inheriting activity calls hooks : doOnStop : ${value}"
    }
}

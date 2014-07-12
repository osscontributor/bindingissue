// test/unit/demo/BandSpec.groovy
package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Band)
class BandSpec extends Specification {

    void "test constructor binding"() {
        given:
        def bindingMap = [name: 'Genesis',
                          'albums[0]': [title: 'Foxtrot', numberOfTracks: 6],
                          'albums[1]': [title: 'Nursery Cryme', numberOfTracks: 7]]
        when:
        def band = new Band(bindingMap)

        then:
        band.name == 'Genesis'
        band.albums.size() == 2
        band.albums[0].title == 'Foxtrot'
        band.albums[0].numberOfTracks == 6
        band.albums[1].title == 'Nursery Cryme'
        band.albums[1].numberOfTracks == 7
    }
}

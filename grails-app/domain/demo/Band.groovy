// grails-app/domain/demo/Band.groovy
package demo

class Band {
    String name
    static hasMany = [albums: Album]
    List albums
}

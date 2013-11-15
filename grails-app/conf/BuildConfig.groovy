grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6

grails.project.repos.default = 'su'
grails.project.repos.su.url = "scpexe://git.it.su.se/afs/su.se/services/maven/it.su.se/maven2"
grails.project.repos.su.type = "maven"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
      mavenRepo "http://maven.it.su.se/it.su.se/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.5'
    }

    plugins {
        build 'se.su.it.grails.plugins:grails-sonar-pom:0.0.4'
        build ':release:3.0.0', ':rest-client-builder:1.0.3', {
          export = false
        }

      test ":code-coverage:1.2.6"
    }
}

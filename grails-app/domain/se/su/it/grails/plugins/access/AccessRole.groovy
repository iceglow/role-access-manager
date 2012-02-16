package se.su.it.grails.plugins.access

class AccessRole {

  String displayName
  String uri

  static constraints = {
    displayName(nullable: false, unique: false)
    uri(nullable: false, unique: true)
  }

  @Override
  boolean equals(Object o) {
    if (!o instanceof AccessRole)
      return super.equals()

    AccessRole accessRole = (AccessRole) o

    this.uri == accessRole.uri
  }
}
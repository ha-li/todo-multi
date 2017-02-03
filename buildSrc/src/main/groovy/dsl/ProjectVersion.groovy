package dsl

/**
 * Created by hlieu on 02/2/17.
 */
class ProjectVersion {
   final Integer major
   final Integer minor
   final String build
   final boolean release

   ProjectVersion (Integer maj, Integer min, String build, boolean rel) {
      this.major = maj
      this.minor = min
      this.build = build
      this.release = rel
   }

   @Override
   String toString () {
      String version = "$major.$minor"
      if(build) {
         version += ".$build"
      }

      if (!release) {
         version += "-SNAPSHOT"
      }
      version
   }
}

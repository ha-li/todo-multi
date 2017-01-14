package dsl

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

/**
 * Created by hlieu on 01/13/17.
 */
class XsltReport extends DefaultTask {
   @InputFile
   @Optional
   File inputFile

   @InputFile
   File xslStyleFile

   @Input
   @Optional
   Map<String, String> params = [:]

   @OutputFile File outputFile

   XsltReport () {
      onlyIf {
         inputFile.exists ()
      }
   }

   @TaskAction
   void start () {
      ant.xslt (in: inputFile, style: xslStyleFile, out: outputFile) {
         params.each {
            key, value ->
               ant.param (name: key, express: value)
         }
      }
   }
}

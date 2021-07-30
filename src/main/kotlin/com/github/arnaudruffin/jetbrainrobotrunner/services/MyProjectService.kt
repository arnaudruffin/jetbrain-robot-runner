package com.github.arnaudruffin.jetbrainrobotrunner.services

import com.github.arnaudruffin.jetbrainrobotrunner.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

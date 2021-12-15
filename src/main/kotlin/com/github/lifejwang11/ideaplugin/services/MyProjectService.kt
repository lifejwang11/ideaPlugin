package com.github.lifejwang11.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.lifejwang11.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

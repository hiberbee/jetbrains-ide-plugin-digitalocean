package com.github.vladyslavvolkov.jetbrainsideplugindigitalocean.services

import com.intellij.openapi.project.Project
import com.github.vladyslavvolkov.jetbrainsideplugindigitalocean.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

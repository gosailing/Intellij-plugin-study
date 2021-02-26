package com.github.gosailing.intellijpluginstudy.services

import com.github.gosailing.intellijpluginstudy.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

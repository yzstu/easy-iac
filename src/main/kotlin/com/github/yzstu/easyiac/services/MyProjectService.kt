package com.github.yzstu.easyiac.services

import com.intellij.openapi.project.Project
import com.github.yzstu.easyiac.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

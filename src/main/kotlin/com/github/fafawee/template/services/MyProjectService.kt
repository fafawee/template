package com.github.fafawee.template.services

import com.intellij.openapi.project.Project
import com.github.fafawee.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

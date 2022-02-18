package com.github.fafawee.template.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.fafawee.template.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}

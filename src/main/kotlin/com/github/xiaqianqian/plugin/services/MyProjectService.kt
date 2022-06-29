package com.github.xiaqianqian.plugin.services

import com.intellij.openapi.project.Project
import com.github.xiaqianqian.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

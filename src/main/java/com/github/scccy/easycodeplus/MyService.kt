package com.github.scccy.easycodeplus

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.components.service

@Service(Service.Level.PROJECT)
internal class MyService(private val project: Project) {
    companion object {
        fun getInstance(project: Project): MyService = project.service()
    }

    fun doWork() {
        TODO()
    }
}
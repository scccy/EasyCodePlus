import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareToggleAction

internal class MyAction : DumbAwareToggleAction() {
    override fun getActionUpdateThread(): ActionUpdateThread = ActionUpdateThread.BGT

    override fun update(e: AnActionEvent) {
        super.update(e)
    }

    override fun isSelected(e: AnActionEvent): Boolean {
        TODO("Not yet implemented")
    }

    override fun setSelected(e: AnActionEvent, p1: Boolean) {
        TODO("Not yet implemented")
    }
}
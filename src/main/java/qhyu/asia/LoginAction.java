package qhyu.asia;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class LoginAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        String name = "yuqihai hello";
        System.out.println(name);
        Messages.showInfoMessage(name,"hello");
    }
}

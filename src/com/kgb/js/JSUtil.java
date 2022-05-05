package com.kgb.js;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.JSFile;
import com.kgb.js.psi.JSJsDefProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JSUtil {

    public static List<JSJsDefProperty> findProperties(Project project) {
        List<JSJsDefProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(JSFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            JSFile jsFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (jsFile != null) {
                JSJsDefProperty[] properties = PsiTreeUtil.getChildrenOfType(jsFile, JSJsDefProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}

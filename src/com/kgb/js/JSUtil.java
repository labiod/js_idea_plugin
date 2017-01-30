package com.kgb.js;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.kgb.js.psi.JSFile;
import com.kgb.js.psi.JSVarDeclaration;
import com.kgb.js.psi.JSVarName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSUtil {
    public static List<JSVarDeclaration> findProperties(Project project, String key) {
        List<JSVarDeclaration> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, JSFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            JSFile simpleFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile); if (simpleFile != null) {
                JSVarDeclaration[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JSVarDeclaration.class);
                if (properties != null) {
                    for (JSVarDeclaration property : properties) {
                        if (key.equals(property.getVar())) {
                            if (result == null) {
                                result = new ArrayList<>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<JSVarDeclaration>emptyList();
    }

    public static List<JSVarDeclaration> findPropertiesBefore(Project project, String key, int offset) {
        List<JSVarDeclaration> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, JSFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            JSFile simpleFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile); if (simpleFile != null) {
                JSVarDeclaration[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JSVarDeclaration.class);
                if (properties != null) {
                    for (JSVarDeclaration property : properties) {
                        if (key.equals(property.getVar()) && property.getNode().getStartOffset() < offset) {
                            if (result == null) {
                                result = new ArrayList<>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<JSVarDeclaration>emptyList();
    }

    public static List<JSVarDeclaration> findProperties(Project project) {
        List<JSVarDeclaration> result = new ArrayList<JSVarDeclaration>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, JSFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            JSFile simpleFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                JSVarDeclaration[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JSVarDeclaration.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}

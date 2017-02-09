package com.kgb.js;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.kgb.js.psi.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSUtil {
//    public static List<JSVarDeclaration> findProperties(Project project, String key) {
//        List<JSVarDeclaration> result = new ArrayList<>();
//        Collection<VirtualFile> virtualFiles =
//                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, JSFileType.INSTANCE,
//                        GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            JSFile jsFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (jsFile != null) {
//                result.addAll(findProperties(project, key, jsFile));
//            }
//        }
//        return result;
//    }
//
//    public static List<JSVarDeclaration> findProperties(Project project, String key, PsiFile jsFile) {
//        List<JSVarDeclaration> result = null;
//        if (jsFile != null) {
//            JSVarDeclaration[] properties = PsiTreeUtil.getChildrenOfType(jsFile, JSVarDeclaration.class);
//            if (properties != null) {
//                for (JSVarDeclaration property : properties) {
//                    if (key.equals(property.getName())) {
//                        if (result == null) {
//                            result = new ArrayList<>();
//                        }
//                        result.add(property);
//                    }
//                }
//            }
//        }
//        return result != null ? result : Collections.<JSVarDeclaration>emptyList();
//    }
//
//    public static List<JSFunctionDeclaration> findFunction(Project project, String key, PsiFile jsFile) {
//        List<JSFunctionDeclaration> result = null;
//        if (jsFile != null) {
//            JSFunctionDeclaration[] properties = PsiTreeUtil.getChildrenOfType(jsFile, JSFunctionDeclaration.class);
//            if (properties != null) {
//                try {
//                    for (JSFunctionDeclaration declaration : properties) {
//                        if (key.equals(declaration.getNameIdentifier().getText())) {
//                            if (result == null) {
//                                result = new ArrayList<>();
//                            }
//                            result.add(declaration);
//                        }
//                    }
//                } catch (Exception e) {
//                    System.out.println("excepiton" + e);
//                }
//            }
//        }
//        return result != null ? result : Collections.emptyList();
//    }
//
//    public static List<JSVarDeclaration> findPropertiesBefore(Project project, String key, int offset) {
//        List<JSVarDeclaration> result = null;
//        Collection<VirtualFile> virtualFiles =
//                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, JSFileType.INSTANCE,
//                        GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            JSFile simpleFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile); if (simpleFile != null) {
//                JSVarDeclaration[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JSVarDeclaration.class);
//                if (properties != null) {
//                    for (JSVarDeclaration property : properties) {
//                        if (key.equals(property.getName()) && property.getNode().getStartOffset() < offset) {
//                            if (result == null) {
//                                result = new ArrayList<>();
//                            }
//                            result.add(property);
//                        }
//                    }
//                }
//            }
//        }
//        return result != null ? result : Collections.<JSVarDeclaration>emptyList();
//    }
//
//    public static List<JSVarDeclaration> findProperties(Project project) {
//        List<JSVarDeclaration> result = new ArrayList<JSVarDeclaration>();
//        Collection<VirtualFile> virtualFiles =
//                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, JSFileType.INSTANCE,
//                        GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            JSFile simpleFile = (JSFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (simpleFile != null) {
//                JSVarDeclaration[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, JSVarDeclaration.class);
//                if (properties != null) {
//                    Collections.addAll(result, properties);
//                }
//            }
//        }
//        return result;
//    }
}

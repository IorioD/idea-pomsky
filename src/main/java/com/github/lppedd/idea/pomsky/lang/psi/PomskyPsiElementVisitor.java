package com.github.lppedd.idea.pomsky.lang.psi;

import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

/**
 * @author Edoardo Luppi
 */
public class PomskyPsiElementVisitor extends PsiElementVisitor {
  public void visitStringLiteral(@NotNull final PomskyStringLiteralPsiElement element) {
    visitElement(element);
  }
}

/* Generated By:JavaCC: Do not edit this line. JlangVisitor.java Version 5.0 */
package parser.ast;

public interface JlangVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTCode node, Object data);
  public Object visit(ASTStatement node, Object data);
  public Object visit(ASTBlock node, Object data);
  public Object visit(ASTParmlist node, Object data);
  public Object visit(ASTFnBody node, Object data);
  public Object visit(ASTFnDef node, Object data);
  public Object visit(ASTReturnExpression node, Object data);
  public Object visit(ASTAssignment node, Object data);
  public Object visit(ASTAssignmentInteger node, Object data);
  public Object visit(ASTAssignmentString node, Object data);
  public Object visit(ASTAssignmentFloat node, Object data);
  public Object visit(ASTAssignmentBoolean node, Object data);
  public Object visit(ASTIfStatement node, Object data);
  public Object visit(ASTForLoop node, Object data);
  public Object visit(ASTWhileLoop node, Object data);
  public Object visit(ASTSwitchStatement node, Object data);
  public Object visit(ASTWrite node, Object data);
  public Object visit(ASTCall node, Object data);
  public Object visit(ASTArgList node, Object data);
  public Object visit(ASTOrExpression node, Object data);
  public Object visit(ASTAndExpression node, Object data);
  public Object visit(ASTComparisonEqual node, Object data);
  public Object visit(ASTComparisonNotEqualTo node, Object data);
  public Object visit(ASTComparisonGreatorThanOrEqualTo node, Object data);
  public Object visit(ASTComparisonLessThanOrEqualTo node, Object data);
  public Object visit(ASTComparisonGreatorThan node, Object data);
  public Object visit(ASTComparisonLessThan node, Object data);
  public Object visit(ASTAddOperator node, Object data);
  public Object visit(ASTSubtractOperator node, Object data);
  public Object visit(ASTTimesOperator node, Object data);
  public Object visit(ASTDivideOperator node, Object data);
  public Object visit(ASTUnaryNotOperator node, Object data);
  public Object visit(ASTUnaryPlusOperator node, Object data);
  public Object visit(ASTUnaryMinusOperator node, Object data);
  public Object visit(ASTFnInvoke node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTDereference node, Object data);
  public Object visit(ASTCharacter node, Object data);
  public Object visit(ASTInteger node, Object data);
  public Object visit(ASTRational node, Object data);
  public Object visit(ASTTrue node, Object data);
  public Object visit(ASTFalse node, Object data);
}
/* JavaCC - OriginalChecksum=c4c3101e0cd38876be1b6b4e3d5d53d7 (do not edit this line) */

/* Generated By:JJTree: Do not edit this line. ASTComparisonNotEqual.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTComparisonNotEqual extends SimpleNode {
  public ASTComparisonNotEqual(int id) {
    super(id);
  }

  public ASTComparisonNotEqual(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e732dddbe9bd97ba8eb6cdbc1bc73776 (do not edit this line) */
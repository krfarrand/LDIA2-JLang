/* Generated By:JJTree: Do not edit this line. ASTTimesOperator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTTimesOperator extends SimpleNode {
  public ASTTimesOperator(int id) {
    super(id);
  }

  public ASTTimesOperator(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6f4bb4ce5c5f23d75c328ae265600e86 (do not edit this line) */

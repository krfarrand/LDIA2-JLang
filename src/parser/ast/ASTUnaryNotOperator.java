/* Generated By:JJTree: Do not edit this line. ASTUnaryNotOperator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTUnaryNotOperator extends SimpleNode {
  public ASTUnaryNotOperator(int id) {
    super(id);
  }

  public ASTUnaryNotOperator(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6682b4a1fdb5a356c01d983cde634a34 (do not edit this line) */
